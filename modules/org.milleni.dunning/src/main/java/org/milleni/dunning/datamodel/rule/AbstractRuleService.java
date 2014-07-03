package org.milleni.dunning.datamodel.rule;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

import org.activiti.engine.delegate.BpmnError;
import org.activiti.engine.delegate.DelegateExecution;
import org.apache.log4j.Logger;
import org.drools.KnowledgeBase;
import org.drools.SystemEventListenerFactory;
import org.drools.agent.KnowledgeAgent;
import org.drools.agent.KnowledgeAgentConfiguration;
import org.drools.agent.KnowledgeAgentFactory;
import org.drools.agent.impl.PrintStreamSystemEventListener;
import org.drools.definition.type.FactType;
import org.drools.io.Resource;
import org.drools.io.ResourceChangeScannerConfiguration;
import org.drools.io.ResourceFactory;
import org.drools.io.impl.ByteArrayResource;
import org.drools.runtime.StatefulKnowledgeSession;
import org.milleni.dunning.datamodel.util.Constants;

public class AbstractRuleService {

	
	@javax.annotation.Resource(name = "dunningPropertyPlaceholder")
	private Properties dunningProperties;
	
	
	protected Map<String, String> parameters = null;
	protected StatefulKnowledgeSession session = null;
	private static final Logger LOG = Logger.getLogger(AbstractRuleService.class);

	private static HashMap<String, KnowledgeAgent> knowledgeBasesCache = new HashMap<String, KnowledgeAgent>();
	private static AtomicBoolean isRulesChangeScanerStarted = new AtomicBoolean(false);

	protected KnowledgeBase readKnowledgeBase(String rulePackage) {

		if (knowledgeBasesCache.containsKey(rulePackage) && knowledgeBasesCache.get(rulePackage).getKnowledgeBase().getFactType(rulePackage, Constants.ExecutionResult)!=null) {			
			return knowledgeBasesCache.get(rulePackage).getKnowledgeBase();
		}

		KnowledgeAgentConfiguration aconf = KnowledgeAgentFactory.newKnowledgeAgentConfiguration();
		aconf.setProperty("drools.agent.scanDirectories", "true");
		aconf.setProperty("drools.agent.scanResources", "true");
		// aconf.setProperty("drools.agent.newInstance", "false");
		KnowledgeAgent kAgent = KnowledgeAgentFactory.newKnowledgeAgent("Knowledge agent for task#" + rulePackage, aconf);

//		UrlResource urlResource = (UrlResource) ResourceFactory.newUrlResource("http://localhost:8085/guvnor/org.drools.guvnor.Guvnor/package/defaultPackage/LATEST/ChangeSet.xml");
//		urlResource.setResourceType(ResourceType.CHANGE_SET);
//		urlResource.setBasicAuthentication("enabled");
//		urlResource.setUsername("admin");
//		urlResource.setPassword("admin");
//		kAgent.applyChangeSet(urlResource);
		
		kAgent.applyChangeSet(new ByteArrayResource(createChangeSetStringFromTaskParameters(rulePackage).getBytes()));

		// kAgent.applyChangeSet(new
		// ByteArrayResource(createChangeSetStringFromTaskParameters().getBytes()));
		knowledgeBasesCache.put(rulePackage, kAgent);
		startRulesScannerIfNeeded();
		SystemEventListenerFactory.setSystemEventListener(new PrintStreamSystemEventListener(System.out));
		return kAgent.getKnowledgeBase();
	}

	public static void invalidateRuleCache(String ruleName) {
		knowledgeBasesCache.remove(ruleName);
	}
	
	public Map executeRules(String ruleName,Map<String,Object> factVariables,Object ...objects) throws InstantiationException, IllegalAccessException{
		KnowledgeBase knowledgeBase = readKnowledgeBase(ruleName);
		StatefulKnowledgeSession workingMemory = knowledgeBase.newStatefulKnowledgeSession();
		FactType executionResultType = knowledgeBase.getFactType(ruleName, "ExecutionResult");
		Object result = executionResultType.newInstance();
		if(factVariables!=null)
			for(String key : factVariables.keySet()) {
				executionResultType.set(result, key , factVariables.get(key));
			}
		workingMemory.insert(result);
		for (Object objectx : objects) {
			workingMemory.insert(objectx);
		}
		workingMemory.fireAllRules();

		return executionResultType.getAsMap(result);
	}
	

	private String createChangeSetStringFromTaskParameters(String rulePackage) {
		// todo: may be some problems (messages in console) now with xml
		// validation during parsing
		// but it's recomended in api-documentation schemas
		StringBuilder str = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + "<change-set xmlns='http://drools.org/drools-5.0/change-set' " + " xmlns:xs='http://www.w3.org/2001/XMLSchema-instance' "
				+ " xs:schemaLocation='http://drools.org/drools-5.0/change-set 	http://anonsvn.jboss.org/repos/labs/labs/jbossrules/trunk/drools-api/src/main/resources/change-set-1.0.0.xsd' >");
		str.append("<add>");
		appendResource(str, dunningProperties.getProperty(Constants.DROOLS_URL)+rulePackage+"/LATEST", "PKG");
		str.append("</add>");
		str.append("</change-set>");
		return str.toString();
	}


	private void appendResource(StringBuilder builder, String source, String type) {
		builder.append("<resource source='");
		builder.append(source);
		builder.append("' type='");
		builder.append(type);

		builder.append("' basicAuthentication='");
		builder.append("enabled");

		builder.append("' username='");
		builder.append("admin");

		builder.append("' password='");
		builder.append("admin");

		builder.append("' />");
	}

	private void startRulesScannerIfNeeded() {
		if (!isRulesChangeScanerStarted.getAndSet(true)) {
			ResourceFactory.getResourceChangeNotifierService().start();
			ResourceFactory.getResourceChangeScannerService().start();

			ResourceChangeScannerConfiguration sconf = ResourceFactory.getResourceChangeScannerService().newResourceChangeScannerConfiguration();
			sconf.setProperty("drools.resource.scanner.interval", "60");
			ResourceFactory.getResourceChangeScannerService().configure(sconf);
		}
	}


	public void throwNotRetryError(DelegateExecution execution, String processStatus, String processStatusDesc) {
		throwBpmError(execution,Constants.NOT_RETRY_ERROR,processStatus,processStatusDesc);
	}
	
	public void throwBpmError(DelegateExecution execution, String errorCode ,String processStatus, String processStatusDesc) {
		execution.setVariable(Constants.PROCESS_STATUS, processStatus);
		execution.setVariable(Constants.PROCESS_STATUS_DESC, processStatusDesc);
		throw new BpmnError(errorCode, processStatusDesc);
	}
}

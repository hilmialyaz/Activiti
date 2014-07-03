package org.milleni.dunning.process.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.type.FactType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerGroup;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.CustomerType;
import org.milleni.dunning.datamodel.rule.AbstractRuleService;
import org.milleni.dunning.datamodel.util.Constants;

public class DroolsTest extends AbstractRuleService {
	public static void main(String[] args) {
		
		Calendar cal33 = Calendar.getInstance();        
		cal33.add(Calendar.DATE, 9);
		
        Calendar cal44 = Calendar.getInstance();
        cal44.add(Calendar.DATE, 3);
        
        if(cal33.getTime().getTime()>cal44.getTime().getTime())
        	System.out.println("birinci buyuk");
		
		Period period = new Period(cal33.getTime().getTime(),cal44.getTime().getTime(),PeriodType.dayTime());
		System.out.println(period);
		
		DroolsTest test =new DroolsTest();
		try {
			test.testRejectionRules();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} 
		
		Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MINUTE, -2);
        
		Date now  = new Date();
		Date from  =cal.getTime();
long diff = Math.round( (now.getTime() - from.getTime()) / 86400000D );
long diffMinute = Math.round( (now.getTime() - from.getTime()) /  (60 * 1000) );

String processWaitTime = "PT15M";
String digits = processWaitTime.replaceAll("[^0-9.]", "");
String nonDigits = processWaitTime.replaceAll("[0-9]","");

long lngProcessWait =Long.parseLong(digits);
long fark =  lngProcessWait - diff;
if(fark<=0)
	System.out.println(fark);
else
	System.out.println(fark);
		
	}

	public void testRejectionRules() throws InstantiationException, IllegalAccessException {

		String drlFileName = "rules/previousProcessStepRules.drl";

		KnowledgeBase knowledgeBase = getKnowledgeBuilder(drlFileName);
		StatefulKnowledgeSession workingMemory = knowledgeBase.newStatefulKnowledgeSession();

		Customer cus = new Customer();
		cus.setStatus("d");

		FactType ProcessStepResultType = knowledgeBase.getFactType("org.milleni.dunning.datamodel.processsteprules", "ExecutionResult");
		Object result = ProcessStepResultType.newInstance();
		ProcessStepResultType.set(result, "resultCode", 0);
		ProcessStepResultType.set(result, "resultText", "");
		ProcessStepResultType.set(result, Constants.loopCount, 4);
		ProcessStepResultType.set(result, "dailyStepCount", 2);// ust sinir
		ProcessStepResultType.set(result, "currentStepCount", 2);// global sms
																	// daily
																	// count
		ProcessStepResultType.set(result, Constants.processStartStep, false);
		// ProcessStepResultType.set( result,"deaktifseAtla", false );
		ProcessStepResultType.set(result, Constants.processStep, "BIR_COA_HATIRLATMA");

		workingMemory.insert(cus);
		workingMemory.insert(result);
		workingMemory.fireAllRules();

		Map execMap = ProcessStepResultType.getAsMap(result);
		String processWaitTime = (String) execMap.get(Constants.processWaitTime);
		Boolean processStartStep = (Boolean) execMap.get(Constants.processStartStep);

		System.out.println(execMap);
	}

	public void testStartRules() throws InstantiationException, IllegalAccessException {

		String drlFileName = "org.milleni.dunning.datamodel.startuprules";

		KnowledgeBase knowledgeBase = readKnowledgeBase("org.milleni.dunning.datamodel.startuprules");
		StatefulKnowledgeSession workingMemory = knowledgeBase.newStatefulKnowledgeSession();

		Customer cus = new Customer(123l);
		CustomerInvoices inv = new CustomerInvoices(1l, 129d, new Date(), new Date(), "N");

		Collection<CustomerInvoices> customerInvoicesCollection = new ArrayList<CustomerInvoices>();
		customerInvoicesCollection.add(inv);
		cus.setCustomerInvoicesCollection(customerInvoicesCollection);

		CustomerGroup group1 = new CustomerGroup(1l, "Trendikom Kurumsal Postpaid");
		CustomerGroup group2 = new CustomerGroup(2l, "Elkotek");

		CustomerType type1 = new CustomerType(1l, "Bireysel");
		CustomerType type2 = new CustomerType(1l, "Kurumsal");
		CustomerType type3 = new CustomerType(1l, "Tanimsiz");

		cus.setCustomerGroup(group2);
		cus.setCustomerType(type2);

		FactType executionResultType = knowledgeBase.getFactType("org.milleni.dunning.datamodel.startuprules", "ExecutionResult");
		Object result = executionResultType.newInstance();
		executionResultType.set(result, "resultCode", 0);
		executionResultType.set(result, "resultText", "");

		workingMemory.insert(cus);
		workingMemory.insert(result);
		workingMemory.fireAllRules();

		Map execMap = executionResultType.getAsMap(result);
		System.out.println("Sonuc: " + execMap);
		Integer executionResult = (Integer) execMap.get("resultCode");

		System.out.println(executionResult);
	}

	public void testInvoicePaymentRules() throws InstantiationException, IllegalAccessException {

		String drlFileName = "invoicePaymentRules.drl";

		KnowledgeBase knowledgeBase = getKnowledgeBuilder(drlFileName);
		StatefulKnowledgeSession workingMemory = knowledgeBase.newStatefulKnowledgeSession();

		Customer cus = new Customer(123l);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -20);

		CustomerInvoices inv = new CustomerInvoices(1l, 8d, cal.getTime(), cal.getTime(), "N");
		cal.add(Calendar.DATE, 50);

		CustomerInvoices inv1 = new CustomerInvoices(2l, 30d, new Date(2013, 4, 10), cal.getTime(), "N");
		System.out.println(inv.getInvoiceDueDate().getYear());

		CustomerInvoices inv2 = new CustomerInvoices(3l, 129d, new Date(), new Date(), "N");

		Collection<CustomerInvoices> customerInvoicesCollection = new ArrayList<CustomerInvoices>();
		customerInvoicesCollection.add(inv);
		customerInvoicesCollection.add(inv1);
		// customerInvoicesCollection.add(inv2);

		cus.setCustomerInvoicesCollection(customerInvoicesCollection);

		CustomerGroup group1 = new CustomerGroup(1l, "Trendikom Kurumsal Postpaid");
		CustomerGroup group2 = new CustomerGroup(2l, "Elkotek");

		CustomerType type1 = new CustomerType(1l, "Bireysel");
		CustomerType type2 = new CustomerType(1l, "Kurumsal");
		CustomerType type3 = new CustomerType(1l, "Tanimsiz");

		cus.setCustomerGroup(group2);
		cus.setCustomerType(type2);

		FactType executionResultType = knowledgeBase.getFactType("org.milleni.dunning.datamodel.invoicepayment", "ExecutionResult");
		Object result = executionResultType.newInstance();
		executionResultType.set(result, "resultCode", 0);
		executionResultType.set(result, "resultText", "");

		workingMemory.insert(cus);
		workingMemory.insert(result);
		workingMemory.fireAllRules();

		Map execMap = executionResultType.getAsMap(result);
		System.out.println("Sonuc: " + execMap);
		Integer executionResult = (Integer) execMap.get("resultCode");

		System.out.println(executionResult);
	}

	public void testValidationRules() throws InstantiationException, IllegalAccessException {

		String drlFileName = "rejectionRules.drl";

		KnowledgeBase knowledgeBase = readKnowledgeBase(Constants.RULES_VALIDATION);
		StatefulKnowledgeSession workingMemory = knowledgeBase.newStatefulKnowledgeSession();

		Customer cus = new Customer(123l);
		cus.setCustomerName("testweweS");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -20);

		CustomerInvoices inv = new CustomerInvoices(1l, 53d, cal.getTime(), cal.getTime(), "N");
		cal.add(Calendar.DATE, 50);

		CustomerInvoices inv1 = new CustomerInvoices(2l, 30d, new Date(2013, 4, 10), cal.getTime(), "N");
		System.out.println(inv.getInvoiceDueDate().getYear());

		CustomerInvoices inv2 = new CustomerInvoices(3l, 129d, new Date(), new Date(), "Y");

		Collection<CustomerInvoices> customerInvoicesCollection = new ArrayList<CustomerInvoices>();
		customerInvoicesCollection.add(inv);
		customerInvoicesCollection.add(inv1);
		// customerInvoicesCollection.add(inv2);

		cus.setCustomerInvoicesCollection(customerInvoicesCollection);

		CustomerGroup group1 = new CustomerGroup(1l, "Trendikom Kurumsal Postpaid");
		CustomerGroup group2 = new CustomerGroup(2l, "Elkotek32232");

		CustomerType type1 = new CustomerType(1l, "Bireysel");
		CustomerType type2 = new CustomerType(1l, "Kurumsal");
		CustomerType type3 = new CustomerType(1l, "Tanimsiz");

		cus.setCustomerGroup(group2);
		cus.setCustomerType(type2);
		cus.setStatus("a");

		FactType executionResultType = knowledgeBase.getFactType(Constants.RULES_VALIDATION, "ExecutionResult");
		Object result = executionResultType.newInstance();
		executionResultType.set(result, "resultCode", 0);
		executionResultType.set(result, "resultText", "");
		executionResultType.set(result, "bpmProcess", "FL301_KurumsalCustomerDunningProcess");

		workingMemory.insert(cus);
		workingMemory.insert(result);
		workingMemory.fireAllRules();

		Map execMap = executionResultType.getAsMap(result);
		System.out.println("Sonuc: " + execMap);
		Integer executionResult = (Integer) execMap.get("resultCode");

		System.out.println(executionResult);
	}

	public void suspensionRules() throws InstantiationException, IllegalAccessException {

		String drlFileName = "suspensionRules.drl";

		KnowledgeBase knowledgeBase = readKnowledgeBase(Constants.RULES_SUSPENSION);
		StatefulKnowledgeSession workingMemory = knowledgeBase.newStatefulKnowledgeSession();

		Customer cus = new Customer(123l);
		cus.setSikayetSayisi(10);
		cus.setCustomerName("testweweS");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -20);

		CustomerInvoices inv = new CustomerInvoices(1l, 53d, cal.getTime(), cal.getTime(), "N");
		// cal.add(Calendar.DATE,50);

		CustomerInvoices inv1 = new CustomerInvoices(2l, 30d, new Date(2013, 4, 10), cal.getTime(), "N");
		System.out.println(inv.getInvoiceDueDate().getYear());

		CustomerInvoices inv2 = new CustomerInvoices(3l, 129d, new Date(), new Date(), "Y");

		Collection<CustomerInvoices> customerInvoicesCollection = new ArrayList<CustomerInvoices>();
		customerInvoicesCollection.add(inv);
		customerInvoicesCollection.add(inv1);
		// customerInvoicesCollection.add(inv2);

		cus.setCustomerInvoicesCollection(customerInvoicesCollection);

		CustomerGroup group1 = new CustomerGroup(1l, "Trendikom Kurumsal Postpaid");
		CustomerGroup group2 = new CustomerGroup(2l, "Elkotek32232");

		CustomerType type1 = new CustomerType(1l, "Bireysel");
		CustomerType type2 = new CustomerType(1l, "Kurumsal");
		CustomerType type3 = new CustomerType(1l, "Tanimsiz");

		cus.setCustomerGroup(group2);
		cus.setCustomerType(type2);
		cus.setStatus("a");

		FactType executionResultType = knowledgeBase.getFactType(Constants.RULES_SUSPENSION, "ExecutionResult");
		Object result = executionResultType.newInstance();
		executionResultType.set(result, "bpmProcess", "FL301_KurumsalCustomerDunningProcess");

		workingMemory.insert(cus);
		workingMemory.insert(result);
		workingMemory.fireAllRules();

		Map execMap = executionResultType.getAsMap(result);
		Integer executionResult = (Integer) execMap.get("resultCode");

		System.out.println(execMap);
	}

	public KnowledgeBase getKnowledgeBuilder(String drlFileName) {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource(drlFileName, getClass()), ResourceType.DRL);
		if (kbuilder.hasErrors()) {
			throw new RuntimeException("Error in drools: " + kbuilder.getErrors().toString());
		}
		return kbuilder.newKnowledgeBase();
	}
}

package org.milleni.dunning.datamodel.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;


@WebService
public class InvoicePaymentOperationsWsImpl implements InvoicePaymentOperationsWs {

	@Autowired
	protected transient RuntimeService runtimeService;
	
	
	@Override
	@WebMethod
	public String doSomeWork(String work) {
		List<ProcessInstance>  processInstances = runtimeService.createProcessInstanceQuery().variableValueEquals("customerId", new Long(1l)).list();
		for (ProcessInstance processInstance : processInstances) {
			List<Execution> executions = null;
			do{
				executions = runtimeService.createExecutionQuery().processInstanceId(processInstance.getId()).signalEventSubscriptionName("invoicePaidSignal").list();
				if(executions!=null && executions.size()>0)  runtimeService.signalEventReceived("invoicePaidSignal",executions.get(0).getId());
			}while(executions!=null && executions.size()>0);
		}
		return "Hello " + work;
	}


}
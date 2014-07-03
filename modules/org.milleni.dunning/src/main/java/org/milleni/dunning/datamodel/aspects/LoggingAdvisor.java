package org.milleni.dunning.datamodel.aspects;

import java.util.Map;
import java.util.Set;

import org.activiti.engine.delegate.BpmnError;
import org.activiti.engine.delegate.DelegateExecution;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.CodeSignature;
import org.aspectj.lang.reflect.MethodSignature;


//@Aspect
public class LoggingAdvisor {

	protected static final Logger logger = Logger.getLogger(LoggingAdvisor.class);

	private static final String ENTERING_STRING = "Entering ";
	private static final String LEAVING_STRING = "Leaving ";
	private static final String METHOD_PARAM_DELIM_START = "{";
	private static final String METHOD_PARAM_DELIM_END = "}";
	
	
	//@Pointcut("execution(* org.milleni.dunning.datamodel.service..*(..))")
	//@Pointcut("within(org.milleni.dunning.datamodel.service..*)")
	//@Pointcut("execution(* org.milleni.dunning.datamodel.service.*.*(..))")
	//@Pointcut("within(org.milleni.dunning.datamodel.service..*)")
	//@Pointcut("execution(* org.milleni.dunning.datamodel.service.*.*(..))")
	public void loggingPointCut() {
	}


	//@Around("loggingPointCut()")
	public Object loggingAdvice(ProceedingJoinPoint joinpoint) throws Throwable {
		long elapsed = System.nanoTime();
		Object retval;
		Signature sig = joinpoint.getSignature();
		Object[] paramValues = joinpoint.getArgs();
		String[] paramNames = ((CodeSignature) sig).getParameterNames();

		logMethodEntry(paramValues, paramNames, sig);
		try {
			retval = joinpoint.proceed();
		} catch (BpmnError e) {
			logger.warn("Business exception received: " + e.getClass() + " Message: " + e.getMessage());
			throw (e);

		} catch (Exception e) {
			logger.error("Exception received: " + e.getClass() + " Message: " + e.getMessage());
			e.printStackTrace();
			throw (e);
		}
		logMethodExit(joinpoint, retval);
		return retval;
	}

	private void logMethodEntry(Object[] methodParamVals, String[] methodParamNames, Signature sig) {
		StringBuffer logString = new StringBuffer((ENTERING_STRING));

		appendMethodName(sig, logString);
		logString.append(" with ");
		appendMethodParameterNamesAndValues(methodParamVals, methodParamNames, logString);

		logger.info(logString.toString());
	}

	private void appendMethodName(Signature sig, StringBuffer logStr) {
		logStr.append("[" + sig.getDeclaringType().getName() + "." + sig.getName() + "]");
	}

	private void appendMethodParameterNamesAndValues(Object[] methodParamVals, String[] methodParamNames, StringBuffer logString) {

		logString.append(METHOD_PARAM_DELIM_START);
		for (int i = 0; i < methodParamVals.length; i++) {
			logString.append(methodParamNames[i] + " = " + paramValInString(methodParamVals[i]) + " - ");
			if("execution".equals(methodParamNames[i]) ){
				DelegateExecution execution = 	(DelegateExecution) methodParamVals[i];
				Set<String> variableNames = execution.getVariableNames();
				for (String variableName : variableNames) {
					logString.append(variableName + " = " + execution.getVariable(variableName)+ " - ");
				}
			}
		}
		logString.append(METHOD_PARAM_DELIM_END);

		// Replace last method param separator with log end separator
		if (methodParamVals.length > 0) {
			logString.replace(logString.indexOf(" - " + METHOD_PARAM_DELIM_END), logString.length(), METHOD_PARAM_DELIM_END);
		}
	}

	private void logMethodExit(ProceedingJoinPoint joinpoint, Object retval) {
		StringBuffer logString = new StringBuffer(LEAVING_STRING);

		appendMethodName(joinpoint.getSignature(), logString);
		logString.append(" with ");
		logString.append(METHOD_PARAM_DELIM_START);

		MethodSignature methodSignature = (MethodSignature) (joinpoint.getSignature());
		if (retval == null) {
			if (methodSignature.getReturnType() == void.class) {
				logString.append("void");
			} else {
				logString.append("null");
			}
		} else {
			logString.append(paramValInString(retval));
		}
		logString.append(METHOD_PARAM_DELIM_END);

		logger.info(logString.toString());
	}

	private String paramValInString(Object parameter) {
		if (parameter == null) {
			return "NULL";
		} else if (parameter instanceof Long) {
			return "" + ((Long) parameter).longValue();
		} else if (parameter instanceof Integer) {
			return "" + ((Integer) parameter).intValue();
		} else if (parameter instanceof Float) {
			return "" + ((Float) parameter).floatValue();
		} else if (parameter instanceof StringBuffer) {
			return new String((StringBuffer) parameter);
		} else {
			return parameter.toString();
		}
	}
}

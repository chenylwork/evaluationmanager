package com.evaluationmanager.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AdminIntercepter extends AbstractInterceptor{
	private static final long serialVersionUID = -4547303442809355141L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext invocationContext = invocation.getInvocationContext();
		Map<String,Object> session = invocationContext.getSession();
		System.out.println("************"+session.containsKey("user"));
		if(session.containsKey("user")) {
			return invocation.invoke();
		}
//		return Action.LOGIN;
		return invocation.invoke();
	}

}

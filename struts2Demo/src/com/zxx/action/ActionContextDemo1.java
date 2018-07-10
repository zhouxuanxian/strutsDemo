package com.zxx.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ActionContextDemo1 extends ActionSupport{
@Override
public String execute() throws Exception {
	ActionContext actionContext = ActionContext.getContext();
	actionContext.put("actionContextMap", "actionContextMapZXX");
	HttpServletRequest request = (HttpServletRequest) actionContext.get(StrutsStatics.HTTP_REQUEST);
	request.setAttribute("requestMap", "requestMapZXX");
	actionContext.getSession().put("sessionMap", "sessionMapZXX");
	actionContext.getApplication().put("applicationMap","applicationMapZXX");
	
	return SUCCESS;
}
}

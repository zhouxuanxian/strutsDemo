package com.zxx.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ActionContextDemo extends ActionSupport{


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
public String execute() throws Exception {
	ActionContext context = ActionContext.getContext();
    HttpServletRequest request = (HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);
    String username =request.getParameter("username");
    String age = request.getParameter("age");
	System.out.println(username);
	System.out.println(age);
	context.put("username", "ZXXRequest");
	context.getSession().put("username", "ZXXsession");
	context.getApplication().put("username", "ZXXapplication");
	return SUCCESS;
}
}

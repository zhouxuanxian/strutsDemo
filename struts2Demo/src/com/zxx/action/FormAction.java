package com.zxx.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


public class FormAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
    public String execute() {
    	 HttpServletRequest request = ServletActionContext.getRequest();
    	 String username =request.getParameter("username");
    	 String age = request.getParameter("age");
    	 System.out.println(username);
    	 System.out.println(age);
    	 request.setAttribute("username", "requestZXXX");
    	 request.getSession().setAttribute("username", "sessionZXXX");
    	 ServletActionContext.getServletContext().setAttribute("username", "applicationZXXX");
    	 
    	 
    	return SUCCESS;
		
	}
}

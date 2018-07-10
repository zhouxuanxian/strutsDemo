package com.zxx.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	public String update() {
		Object loginInfo=ServletActionContext.getRequest().getSession().getAttribute("loginINFO");
		if(loginInfo==null) {
			return LOGIN;
		}
		
		System.out.println("update����");
		return SUCCESS;
	}
	public String delete() {
		System.out.println("delete����");
		return SUCCESS;
	}
	public String execute() throws Exception {
		System.out.println("execute����");
		return SUCCESS;
	}
}

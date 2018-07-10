package com.zxx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zxx.domain.User;

public class registerAction extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user =new User();
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(user.toString());
		return SUCCESS;
	}

}

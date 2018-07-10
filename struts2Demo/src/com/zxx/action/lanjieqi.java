package com.zxx.action;

import com.opensymphony.xwork2.ActionSupport;

public class lanjieqi  extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("进入了拦截器的action函数！！！");
		return SUCCESS;
	}

}

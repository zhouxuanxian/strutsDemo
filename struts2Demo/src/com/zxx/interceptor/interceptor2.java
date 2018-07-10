package com.zxx.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class interceptor2 implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("2ºÅÀ¹½ØÆ÷Ö®Ç°");
		
		invocation.invoke();
		
		
		System.out.println("2ºÅÀ¹½ØÆ÷Ö®ºó");
		return null;
	}

}

package com.zxx.action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.zxx.domain.Dog;

public class valueStackAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		ActionContext ac= ActionContext.getContext();
		ValueStack vStack= ac.getValueStack();
		vStack.push(new Dog("¹þ°Í¹·", "¹«"));
	
		
		
		return SUCCESS;
	}

}

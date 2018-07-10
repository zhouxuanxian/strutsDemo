package com.zxx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zxx.domain.Person;

public class uploadAction extends ActionSupport implements ModelDriven<Person>{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Person person=new Person();
	@Override
	public Person getModel() {
		// TODO Auto-generated method stub
		return person;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(person.toString());
		return SUCCESS;
	}
	

}

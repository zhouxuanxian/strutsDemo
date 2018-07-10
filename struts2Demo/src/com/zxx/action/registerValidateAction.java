package com.zxx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zxx.domain.People;

public class registerValidateAction extends ActionSupport implements ModelDriven<People>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private People people=new People();
	@Override
	public People getModel() {
		// TODO Auto-generated method stub
		return people;
	}
//	@Override
//	public void validate() {
//		if (people!=null) {
//			if (people.getName()==null ||people.getName().equals("")) {
//				this.addFieldError("name.error", "用户名不为空");
//			}
//			if (people.getPassword()==null ||people.getPassword().equals("")) {
//				this.addFieldError("password.error", "密码不为空");
//			}
//			if (people.getPhone()==null ||people.getPhone().equals("")) {
//				this.addFieldError("phone.error", "电话不为空");
//			}
//			if (people.getEmail()==null ||people.getEmail().equals("")) {
//				this.addFieldError("email.error", "邮件不为空");
//			}
//		}
//	}
@Override
public String execute() throws Exception {
	System.out.println("进入注册的后台");
	
	return SUCCESS;
}


}

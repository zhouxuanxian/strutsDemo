package com.zxx.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;


public class jiekouZhuruAcion extends ActionSupport implements ServletRequestAware,ServletContextAware{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
    private ServletContext application;
    @Override
    public String execute() throws Exception {
        String username = request.getParameter("username");
        //String age =request.getParameter("age");
        System.out.println(username);
        //System.out.println(age);
        request.setAttribute("username", username);
        request.getSession().setAttribute("username", username);
        //application.setAttribute("username", age);
        return SUCCESS;
    }
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
		
	}
	@Override
	public void setServletContext(ServletContext context) {
		this.application=context;
		
	}

}

package com.zxx.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class downLoadAction extends ActionSupport{


	private static final long serialVersionUID = 1L;
	private File file=null;
	
	//�ṩ�ļ�������
	public String getFileName() throws Exception {
		System.out.println("1234");
		return URLEncoder.encode(file.getName(), "utf-8");
	}
	
	//�ṩ���ص�������
	public InputStream getFileStream() throws Exception {
		System.out.println("1234123");
		return new FileInputStream(file);	
		
	}
	@Override
	public String execute() throws Exception {
		String uploadpath = ServletActionContext.getServletContext().getRealPath("upload");
		System.out.println(uploadpath);
		file=new File(uploadpath+"/ͼƬ1.png");
		return SUCCESS;
	}

}

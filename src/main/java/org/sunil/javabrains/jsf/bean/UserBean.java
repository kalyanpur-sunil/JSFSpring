package org.sunil.javabrains.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.sunil.javabrains.service.UserService;

@Component
@ManagedBean
@SessionScoped
public class UserBean {

	@Autowired
	UserService userService;
	
	public String printMsgFromSpring(){
		return userService.getMessage();
	}
}

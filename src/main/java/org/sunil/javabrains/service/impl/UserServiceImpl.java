package org.sunil.javabrains.service.impl;

import org.springframework.stereotype.Service;
import org.sunil.javabrains.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getMessage() {
		return "JSF 2.0 + Spring Integration!";
	}

}

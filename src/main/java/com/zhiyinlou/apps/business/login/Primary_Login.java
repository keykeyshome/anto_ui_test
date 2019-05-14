package com.zhiyinlou.apps.business.login;

import com.zhiyinlou.apps.page.login.Page_Login;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Primary_Login {
	
	public static Logger logger = LogManager.getLogger(Primary_Login.class);
	
	
	Page_Login page_Login=new Page_Login();
	
	
	public void login(String username, String password) {
		page_Login.sleep(3000);
		page_Login.input_username(username);
		page_Login.sleep(3000);
		page_Login.input_password(password);
		page_Login.sleep(3000);
		page_Login.click_login();
		page_Login.sleep(10000);
	}
	

}

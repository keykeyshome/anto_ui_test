package com.zhiyinlou.apps.testcase.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.zhiyinlou.apps.business.login.Biz_Login;
import com.zhiyinlou.apps.testcase.base.BaseCase;

public class LoginTcs extends BaseCase {
	
	public static Logger logger = LogManager.getLogger(LoginTcs.class);

	Biz_Login biz_Login=new Biz_Login();
	
	@Test(dataProvider = "dataSource")
	public void test(String username, String password) {
		
		biz_Login.login(username, password);
		
	}
	

}

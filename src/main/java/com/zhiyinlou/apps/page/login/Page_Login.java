package com.zhiyinlou.apps.page.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.zhiyinlou.apps.objectRepository.WebCommon;
import com.zhiyinlou.apps.objectRepository.WebInput;
import com.zhiyinlou.apps.page.base.BasePage;

public class Page_Login extends BasePage{
	
	public static Logger logger = LogManager.getLogger(Page_Login.class);
	
	public void input_username(String username){
		logger.info("输入用户名...");
		WebInput input_username = objectFactory.getWebInput("请输入用户名");
		input_username.clearAndInput(username);
	}
	public void input_password(String password){
		logger.info("请输入密码...");
		WebInput input_password = objectFactory.getWebInput("请输入密码");
		input_password.clearAndInput(password);
	}
	public void click_login(){
		logger.info("点击登录...");
 		WebCommon click_login = objectFactory.getWebCommon("登录");
		click_login.click();
	}
	public void click_reback(){
		logger.info("点击返回系统...");
		WebCommon reback = objectFactory.getWebCommon("返回系统");
		reback.click();
	}
	
	
}

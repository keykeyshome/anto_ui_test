package com.zhiyinlou.apps.testcase.login;

import com.zhiyinlou.apps.business.login.Biz_Login;
import com.zhiyinlou.apps.business.login.Primary_Login;
import com.zhiyinlou.apps.testcase.base.BaseCase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LoginTcsPrimary extends BaseCase {

    public static Logger logger = LogManager.getLogger(LoginTcsPrimary.class);

    Primary_Login primary_Login = new Primary_Login();

    @Test(dataProvider = "dataSource")
    public void test(String username, String password) {

        primary_Login.login(username, password);

    }


}

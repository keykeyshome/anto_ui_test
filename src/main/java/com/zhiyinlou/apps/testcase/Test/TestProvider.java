package com.zhiyinlou.apps.testcase.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestProvider {
    public static Logger logger = LogManager.getLogger(TestProvider.class);

    @Test(dataProvider = "testd")
    public void test(String username, String password) {
        System.out.println(username + "---" + password);

    }

    @DataProvider(name = "testd")
    public Object[][] createData1() {
        return new Object[][]{

                {"Cedric", "35"},
                {"Anne", "36"},
                {"Cedric", "37"},
                {"Anne", "38"}
        };
    }


}

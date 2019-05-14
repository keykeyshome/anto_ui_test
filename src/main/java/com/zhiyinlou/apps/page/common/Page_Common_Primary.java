package com.zhiyinlou.apps.page.common;

import com.zhiyinlou.apps.objectRepository.WebCommon;
import com.zhiyinlou.apps.objectRepository.WebLi;
import com.zhiyinlou.apps.objectRepository.WebSpan;
import com.zhiyinlou.apps.page.base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Page_Common_Primary extends BasePage {
    public static Logger logger = LogManager.getLogger(Page_Common_Primary.class);

    //点击用户名
    public void click_username() {
        logger.info("点击用户名...");
        WebSpan username = objectFactory.getWebSpan("用户名");
        username.click();
    }

    //点击口算出题器
    public void click_calculator() {
        logger.info("口算出题器...");
        WebCommon paper = objectFactory.getWebCommon("口算出题器");
        paper.click();
    }

    //点击学情组卷
    public void click_learningTestParper() {
        logger.info("学情组卷...");
        WebCommon test = objectFactory.getWebCommon("学情组卷");
        test.click();
    }

    //点击练习册
    public void click_workbooks() {
        logger.info("配套练习册...");
        WebCommon studyanalysis = objectFactory.getWebCommon("配套练习册");
        studyanalysis.click();
    }


}

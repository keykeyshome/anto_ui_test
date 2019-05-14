package com.zhiyinlou.apps.page.paper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.zhiyinlou.apps.objectRepository.WebCommon;
import com.zhiyinlou.apps.page.base.BasePage;


public class Page_Paper extends BasePage{
	
	public static Logger logger = LogManager.getLogger(Page_Paper.class);

	public void click_chapter(){
		logger.info("点击章节出题...");
		WebCommon chapter = objectFactory.getWebCommon("章节出题");
		chapter.click();
	}
	public void click_knowledgepoint(){
		logger.info("点击知识点出题...");
		WebCommon knowledgepoint = objectFactory.getWebCommon("知识点出题");
		knowledgepoint.click();
	}
	public void click_diy(){
		logger.info("点击DIY出题...");
		WebCommon diy = objectFactory.getWebCommon("DIY出题");
		diy.click();
	}
	public void click_learnemotion(){
		logger.info("点击学情组卷...");
		WebCommon learnemotion = objectFactory.getWebCommon("学情组卷");
		learnemotion.click();
	}
	public void click_manual(){
		logger.info("点击手工组卷...");
		WebCommon manual = objectFactory.getWebCommon("手工组卷");
		manual.click();
	}
	public void click_competitive(){
		logger.info("点击精品卷库...");
		WebCommon competitive = objectFactory.getWebCommon("精品卷库");
		competitive.click();
	}
	public void click_mylibrary(){
		logger.info("点击我的卷库...");
		WebCommon mylibrary = objectFactory.getWebCommon("我的卷库");
		mylibrary.click();
	}

}

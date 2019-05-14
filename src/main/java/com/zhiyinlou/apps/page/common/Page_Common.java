package com.zhiyinlou.apps.page.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.zhiyinlou.apps.objectRepository.WebCommon;
import com.zhiyinlou.apps.objectRepository.WebLi;
import com.zhiyinlou.apps.objectRepository.WebSpan;
import com.zhiyinlou.apps.page.base.BasePage;


public class Page_Common extends BasePage{
	public static Logger logger = LogManager.getLogger(Page_Common.class);
	
	//点击用户名
	public void click_username(){
		logger.info("点击用户名...");
		WebSpan username=objectFactory.getWebSpan("用户名");
		username.click();
	}
	//点击选题组卷
	public void click_paper(){
		logger.info("点击选题组卷...");
		WebLi paper=objectFactory.getWebLi("选题组卷");
		paper.click();
	}
	//点击考试阅卷
	public void click_test(){
		logger.info("点击考试阅卷...");
		WebLi test=objectFactory.getWebLi("考试阅卷");
		test.click();
	}
	//点击学情分析
	public void click_studyanalysis(){
		logger.info("点击学情分析...");
		WebCommon studyanalysis=objectFactory.getWebCommon("学情分析");
		studyanalysis.click();
	}
	//点击考试分析
	public void click_examanalysis(){
		logger.info("点击考试分析...");
		WebCommon examanalysis=objectFactory.getWebCommon("考试分析");
		examanalysis.click();
	}
	//点击学情追踪
	public void click_trace(){
		logger.info("点击学情追踪...");
		WebCommon trace=objectFactory.getWebCommon("学情追踪");
		trace.click();
	}
	//点击精品卷库
	public void click_competitive(){
		logger.info("点击精品卷库...");
		WebLi competitive=objectFactory.getWebLi("精品卷库");
		competitive.click();
	}
	
	
	
}

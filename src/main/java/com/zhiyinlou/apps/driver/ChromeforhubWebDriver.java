package com.zhiyinlou.apps.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.zhiyinlou.apps.listener.WebDriverEventListenerImpl;
import com.zhiyinlou.apps.utils.file.ParseProperties;

public class ChromeforhubWebDriver {
	private static final Logger logger = LogManager.getLogger(ChromeforhubWebDriver.class);
	
	private WebDriver driver;
	
	public WebDriver getInstance() {

		logger.info("try to get chrome webdriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		String url_remote = ParseProperties.getInstance().getProperty("url_remote");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chromeOptions", options);
		
		URL url = null;
		try {
		    url = new URL(url_remote);
		} catch (MalformedURLException e) {
		    e.printStackTrace();
		}
		driver = new RemoteWebDriver(url,capabilities);

		return new EventFiringWebDriver(driver).register(new WebDriverEventListenerImpl());
	}
	


}

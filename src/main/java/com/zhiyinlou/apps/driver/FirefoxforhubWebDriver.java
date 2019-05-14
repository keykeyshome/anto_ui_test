package com.zhiyinlou.apps.driver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.zhiyinlou.apps.listener.WebDriverEventListenerImpl;
import com.zhiyinlou.apps.utils.file.ParseProperties;

public class FirefoxforhubWebDriver {
	private static final Logger logger = LogManager.getLogger(FirefoxforhubWebDriver.class);

	private WebDriver driver;

	public WebDriver getInstance() {

		logger.info("try to get chrome webdriver");
		Properties prop = ParseProperties.getInstance();
		String profileLoc = prop.getProperty("firefoxprofileLoc");
		String firefoxLoc = prop.getProperty("firefoxLoc");
		
		FirefoxProfile profile = new FirefoxProfile(new File(profileLoc));


		driver = new FirefoxDriver(new FirefoxBinary(new File(firefoxLoc)), profile);

		return new EventFiringWebDriver(driver).register(new WebDriverEventListenerImpl());
	}

}

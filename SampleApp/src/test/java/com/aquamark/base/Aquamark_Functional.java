package com.aquamark.base;

import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public abstract class Aquamark_Functional {
	public static final Logger logger = LogManager.getLogger(Aquamark_Functional.class);
	private static String APPIUM_PORT = System.getenv("APPIUM_PORT");
	public static String IMAGE_PATH = System.getenv("IMAGE_PATH");
	public static AndroidDriver<MobileElement> driver;
	
	static {
		logger.info("Timestamp Test Started:" + new Timestamp(new Date().getTime()));
		if(IMAGE_PATH == null) {
			IMAGE_PATH = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
		}
	}
	
	public static AndroidDriver<MobileElement> getDriver() {
		try {
			if(driver != null) {
				return driver;
			}
			System.out.println(IMAGE_PATH+" - "+APPIUM_PORT);
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("autoGrantPermissions", true);
			capabilities.setCapability("androidInstallTimeout",600000);
			driver = new AndroidDriver<MobileElement>(new URL(getUrl()),capabilities);
			System.out.println(driver);
			return driver;
		}catch (Exception e) {
			System.out.println("Error in creating driver");
			e.printStackTrace();
			return null;
		}
	}
	
	private static String getUrl() {
		try {
			String url = "http://127.0.0.1:4723/wd/hub";
			if(APPIUM_PORT != null) {
				url = "http://127.0.0.1:"+APPIUM_PORT+"/wd/hub";
			}
			System.out.println("Url formed is :- "+url);
			return url;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void closeDriver() {
		try {
			driver.quit();
		}catch(Exception e) {
			logger.info(e.getMessage());
		}
		finally {
			logger.info("Timestamp Test Finished:" + new Timestamp(new Date().getTime()));
		}
	}
}

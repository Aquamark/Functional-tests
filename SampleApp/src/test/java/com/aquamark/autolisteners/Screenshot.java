package com.aquamark.autolisteners;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Screenshot{

	AndroidDriver<MobileElement> androidDriver = null;
	
	public Screenshot(AndroidDriver<MobileElement> androidDriver) {
		this.androidDriver = androidDriver;
	}
	
	public String captureScreenshot(String screenshotName, String path) {
		try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-SSS");
				screenshotName += "_"+sdf.format(new Date());
				TakesScreenshot ts = (TakesScreenshot) androidDriver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				String dest = path + "/" + screenshotName + ".png";
				File destination = new File(dest);
				FileUtils.copyFile(src,destination);
				return dest;
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot");
//			e.printStackTrace();
			return e.getMessage();
		}	
	}
}

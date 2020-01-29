package com.aquamark.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DashboardPO {
	AndroidDriver<MobileElement> androidDriver;
	WebElement ele;
	MobileElement ele1;

	public DashboardPO(AndroidDriver<MobileElement> androidDriver) {
		this.androidDriver = androidDriver;
	}
	
	public WebElement skip() {
		ele = androidDriver.findElement(By.id("btn_skip"));
		return ele;
	}

	public WebElement editProfileOverlay() {
		ele = androidDriver.findElement(By.id("text"));
		return ele;
	}

	public WebElement calendarOverlay() {
		ele = androidDriver.findElement(By.id("text"));
		return ele;
	}

	public WebElement referAndEarnOverlay() {
		ele = androidDriver.findElement(By.id("text"));
		return ele;
	}

	public WebElement creditsOverlay() {
		ele = androidDriver.findElement(By.id("cv_productservices_item"));
		return ele;
	}

	public WebElement manageSKillsOverlay() {
		ele = androidDriver.findElement(By.id("Rel_interviews"));
		return ele;
	}

	public WebElement viewAssessorsOverlay() {
		ele = androidDriver.findElement(By.id("user_img_name"));
		return ele;
	}
	
	public WebElement viewAssessorsOverlayfail() {
		ele = androidDriver.findElement(By.id("user_img_name_01"));
		return ele;
	}

}

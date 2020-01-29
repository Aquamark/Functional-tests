package com.aquamark.pageobjects;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CandidateLoginPO {
	AndroidDriver<MobileElement> androidDriver;
	WebElement ele;
	MobileElement ele1;

	public CandidateLoginPO(AndroidDriver<MobileElement> androidDriver2) {
		this.androidDriver = androidDriver2;
	}

	public WebElement loginText1() {
		ele = androidDriver.findElement(By.id("menu_login"));
		return ele;
	}

	public WebElement loginText() throws Exception {
		try {
			ele = androidDriver.findElement(By.id("menu_login"));
			return ele;
		} catch (NoSuchElementException e) {
			try {
				ele = androidDriver.findElement(By.id("custom_ok"));
				ele.click();
				ele.click();
				loginText();
				return ele;
			} catch (Exception e1) {
				throw e1;

			}
		}

	}

	public WebElement registerText() {
		ele = androidDriver.findElement(By.id("menu_register"));
		return ele;
	}
	
	public WebElement searchBtn() {
		ele = androidDriver.findElement(By.id("btn_search"));
		return ele;
	}
	
	public WebElement searchResult() {
		ele = androidDriver.findElement(By.id("relay_AssessorSkills"));
		return ele;
	}
	
	public WebElement applyBtn() {
		ele = androidDriver.findElement(By.id("custom_ok"));
		return ele;
	}
	
	public WebElement appliedOkBtn() {
		ele = androidDriver.findElement(By.id("custom_ok"));
		return ele;
	}
	
	public WebElement Username() {
		ele = androidDriver.findElement(By.id("et_emailId"));
		return ele;
	}

	public WebElement Password() {
		ele = androidDriver.findElement(By.id("et_password"));
		if (ele.isDisplayed()) {
			return ele;
		}
		return null;
	}

	public WebElement Login() {
		ele = androidDriver.findElement(By.id("btn_login"));
		return ele;
	}

	public WebElement incorrectEmailPwdPopup() {
		ele = androidDriver.findElement(By.id("custom_ok"));
		return ele;
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

	public WebElement viewAssessorsOverlayWrong() {
		ele = androidDriver.findElement(By.id("user_img_name1"));
		return ele;
	}

	public WebElement glitchOkBtn() {
		ele = androidDriver.findElement(By.id("custom_ok"));
		return ele;
	}

	public boolean glitchText() {
		try {
			ele = androidDriver.findElement(By.id("custom_ok"));
			ele.click();
			ele.click();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

}


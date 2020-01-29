package com.aquamark.pageobjectmethods;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.aquamark.autolisteners.Screenshot;
import com.aquamark.pageobjects.CandidateLoginPO;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CandidateLogin {

	AndroidDriver<MobileElement> androidDriver;

	CandidateLoginPO candidateloginPO;
	public static final String IMAGE_PATH = System.getenv("IMAGE_PATH");
	Screenshot screenshot;
	public static final Logger logger = LogManager.getLogger(CandidateLogin.class);

	public CandidateLogin(AndroidDriver<MobileElement> androidDriver2) {
		this.androidDriver = androidDriver2;
		candidateloginPO = new CandidateLoginPO(androidDriver2);

	}
	
	public boolean glitchMethod() throws Exception{
		boolean isGlitchFOund = candidateloginPO.glitchText();
		return isGlitchFOund;
	}

	public void loginTextmethod() throws Exception {
		candidateloginPO.loginText().click();

	}

	public void enterUsernameAndPassword(String username, String password) throws Exception {

		candidateloginPO.Username().click();

		candidateloginPO.Username().clear();
		candidateloginPO.Username().click();
		candidateloginPO.Username().sendKeys(username);

		candidateloginPO.Password().click();

		candidateloginPO.Password().clear();
		candidateloginPO.Password().click();
		candidateloginPO.Password().sendKeys(password);
	}

	public void hideKeyboardMethod() throws Exception {
		try {
			androidDriver.hideKeyboard();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void clickLoginBtn() throws Exception {
		candidateloginPO.Login().click();
	}

	public void clickRegisterBtnMethod() throws Exception {
		candidateloginPO.registerText().click();
	}
	
	public void searchBtnMethod() throws Exception {
		candidateloginPO.searchBtn().click();
	}
	
	public void searchResultMethod() throws Exception {
		candidateloginPO.searchResult().click();
	}
	
	public void applyBtnMethod() throws Exception {
		candidateloginPO.applyBtn().click();
	}
	
	public void appliedOkBtnMethod() throws Exception {
		candidateloginPO.appliedOkBtn().click();
	}

	public void clickLoginBtnAndClear() throws Exception {
		candidateloginPO.Login().click();
		candidateloginPO.Username().click();
		candidateloginPO.Username().clear();
		candidateloginPO.Password().click();
		candidateloginPO.Password().clear();
	}

	public void incorrectEmailAndPwdMethod() throws Exception {
		candidateloginPO.incorrectEmailPwdPopup().click();
	}

	public void clickSkipBtn() throws Exception {
		candidateloginPO.skip().click();
	}

	public void editOverlayMethod() throws Exception {
		candidateloginPO.editProfileOverlay().click();
	}

	public void calendarOverlayMethod() throws Exception {
		candidateloginPO.calendarOverlay().click();
	}

	public void referAndEarnOverlayMethod() throws Exception {
		candidateloginPO.referAndEarnOverlay().click();
	}

	public void creditsOverlayMethod() throws Exception {
		candidateloginPO.creditsOverlay().click();
	}

	public void manageSkillsOverlayMethod() throws Exception {
		candidateloginPO.manageSKillsOverlay().click();
	}

	public void viewAssessorOverlayMethod() throws Exception {
		candidateloginPO.viewAssessorsOverlay().click();
	}

	public void viewAssessorOverlayMethodWrongMethod() throws Exception {
		candidateloginPO.viewAssessorsOverlay().click();
	}

}


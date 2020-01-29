package com.aquamark.pageobjectmethods;

import com.aquamark.pageobjects.CandidateLoginPO;
import com.aquamark.pageobjects.DashboardPO;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Dashboard {
	AndroidDriver<MobileElement> androidDriver;
	//SetAppiumDriver browser;
	CandidateLoginPO candidateloginPO;
	DashboardPO dashboardPO;

//	@SuppressWarnings("deprecation")
	public Dashboard(AndroidDriver<MobileElement> androidDriver2) {
		this.androidDriver = androidDriver2;
		candidateloginPO = new CandidateLoginPO(androidDriver2);
		dashboardPO=new DashboardPO(androidDriver2);
		//System.out.println("abcd");

	}

	public void clickSkipMethod() {
		dashboardPO.skip().click();
	}
	
	public void clickEditProfileOverlay() {
		dashboardPO.editProfileOverlay().click();
	}
	
	public void clickCalendarOverlay() {
		dashboardPO.calendarOverlay().click();
	}
	
	public void clickReferAndEarnOverlay() {
		dashboardPO.referAndEarnOverlay().click();
	}
	
	public void clickCreditsOverlay() {
		dashboardPO.creditsOverlay().click();
	}
	
	public void clickManageSkillsOverlay() {
		dashboardPO.manageSKillsOverlay().click();
	}
	
	public void clickViewAssessorsOverlay() {
		dashboardPO.viewAssessorsOverlay().click();
	}

	public void clickViewAssessorsOverlaytoFail() {
		dashboardPO.viewAssessorsOverlayfail().click();
	}

}

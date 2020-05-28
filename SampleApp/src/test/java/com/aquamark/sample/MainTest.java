package com.aquamark.sample;

import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aquamark.autolisteners.Screenshot;
import com.aquamark.base.Aquamark_Functional;
import com.aquamark.pageobjectmethods.CandidateLogin;
import com.aquamark.pageobjectmethods.Dashboard;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MainTest extends Aquamark_Functional {

	public static final Logger logger = LogManager.getLogger(MainTest.class);
	private AndroidDriver<MobileElement> androidDriver;

	Screenshot screenshot;
	CandidateLogin candidateLogin;
	Dashboard dashboard;

	@BeforeClass
	public void setUp() {
		try {
			logger.info("Timestamp Before Launch:" + new Timestamp(new Date().getTime()));
			androidDriver = getDriver();
			logger.info("Timestamp when App Launched:" + new Timestamp(new Date().getTime()));
			candidateLogin = new CandidateLogin(androidDriver);
			dashboard = new Dashboard(androidDriver);
			screenshot = new Screenshot(androidDriver);
			androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			logger.error("Error in setUp()", e);
		}
	}
	
	@Test(priority = 1,description = "All tests")
	public void callAllTests() throws Exception{
		clickGlitch();
		clickLoginText();
		clickOnRegister();
		clickOnSearch();
		clickOnSearchResult();
		clickOnApply();
		clickOkText();
	}

	public void clickGlitch() throws InterruptedException {
		try {

			logger.info("Before Glitch");
			screenshot.captureScreenshot("Before Glitch", IMAGE_PATH);

			boolean isGlitchFound = candidateLogin.glitchMethod();
			if (isGlitchFound) {
				setUp();
			}

			logger.info("Clicked on Glitch");
		} catch (Exception e) {
			logger.info("Click on Glitch Failed");
		}

		logger.info("After Glitch");
		screenshot.captureScreenshot("After Glitch", IMAGE_PATH);

	}

	public void clickLoginText() throws InterruptedException {
		try {

			logger.info("TestCase:Click on Login Text" + "-SubTestCase:Before Click on Login-SubCaseResult:PASSED");
			screenshot.captureScreenshot("Click on Login Text_Before Click on Login", IMAGE_PATH);

			candidateLogin.loginTextmethod();
			
			logger.info("TestCase:Click on Login Text" + "-TestResult:PASSED");
		} catch (Exception e) {
			logger.info("TestCase:Click on Login Text" + "-TestResult:FAILED");
		}

		logger.info("TestCase:Click on Login Text" + "-SubTestCase:After Click on Login-SubCaseResult:PASSED");
		screenshot.captureScreenshot("Click on Login Text_After Click on Login", IMAGE_PATH);
		androidDriver.navigate().back();

	}


	public void clickOnRegister() throws InterruptedException {
		try {

			logger.info(
					"TestCase:Click on Register Text" + "-SubTestCase:Before Click on Register-SubCaseResult:PASSED");
			screenshot.captureScreenshot("Click on Register Text_Before Click on Register", IMAGE_PATH);

			candidateLogin.clickRegisterBtnMethod();

			logger.info("TestCase:Click on Register Text" + "-TestResult:PASSED");
		} catch (Exception e) {
			logger.info("TestCase:Click on Register Text" + "-TestResult:FAILED");
		}

		logger.info("TestCase:Click on Register Text" + "-SubTestCase:After Click on Register-SubCaseResult:PASSED");
		screenshot.captureScreenshot("Click on Register Text_After Click on Register", IMAGE_PATH);
		androidDriver.navigate().back();

	}


	public void clickOnSearch() throws InterruptedException {
		try {

			logger.info("TestCase:Click on Search Text" + "-SubTestCase:Before Click on Search-SubCaseResult:PASSED");
			screenshot.captureScreenshot("Click on Search Text_Before Click on Search", IMAGE_PATH);

			candidateLogin.searchBtnMethod();

			logger.info("TestCase:Click on Search Text" + "-TestResult:PASSED");
		} catch (Exception e) {
			logger.info("TestCase:Click on Search Text" + "-TestResult:FAILED");
		}

		logger.info("TestCase:Click on Search Text" + "-SubTestCase:After Click on Search-SubCaseResult:PASSED");
		screenshot.captureScreenshot("Click on Search Text_After Click on Search", IMAGE_PATH);

	}

	public void clickOnSearchResult() throws InterruptedException {
		try {

			logger.info("TestCase:Click on Search Result"
					+ "-SubTestCase:Before Click on Search_Result-SubCaseResult:PASSED");
			screenshot.captureScreenshot("Click on Search Result_Before Click on Search_Result", IMAGE_PATH);

			candidateLogin.searchResultMethod();

			logger.info("TestCase:Click on Search Result" + "-TestResult:PASSED");
		} catch (Exception e) {
			logger.info("TestCase:Click on Search Result" + "-TestResult:FAILED");
		}

		logger.info(
				"TestCase:Click on Search Result" + "-SubTestCase:After Click on Search_Result-SubCaseResult:PASSED");
		screenshot.captureScreenshot("Click on Search Result_After Click on Search_Result", IMAGE_PATH);

	}


	public void clickOnApply() throws InterruptedException {
		try {

			logger.info("TestCase:Click on Apply Text" + "-SubTestCase:Before Click on Apply-SubCaseResult:PASSED");
			screenshot.captureScreenshot("Click on Apply Text_Before Click on Apply", IMAGE_PATH);

			candidateLogin.applyBtnMethod();

			logger.info("TestCase:Click on Apply Text" + "-TestResult:PASSED");
		} catch (Exception e) {
			logger.info("TestCase:Click on Apply Text" + "-TestResult:FAILED");
		}

		logger.info("TestCase:Click on Apply Text" + "-SubTestCase:After Click on Apply-SubCaseResult:PASSED");
		screenshot.captureScreenshot("Click on Apply Text_After Click on Apply", IMAGE_PATH);

	}


	public void clickOkText() throws InterruptedException {
		try {

			logger.info("TestCase:Click on Ok Text" + "-SubTestCase:Before Click on Ok-SubCaseResult:PASSED");
			screenshot.captureScreenshot("Click on Ok Text_Before Click on Ok", IMAGE_PATH);

			candidateLogin.appliedOkBtnMethod();

			logger.info("TestCase:Click on Ok Text" + "-TestResult:PASSED");
		} catch (Exception e) {
			logger.info("TestCase:Click on Ok Text" + "-TestResult:FAILED");
		}

		logger.info("TestCase:Click on Ok Text" + "-SubTestCase:After Click on Ok-SubCaseResult:PASSED");
		screenshot.captureScreenshot("Click on Ok Text_After Click on Ok", IMAGE_PATH);

	}

	@AfterClass
	public void cleanUp() {
		try {
			closeDriver();
			logger.info("driver closed successfully");
		} catch (Exception e) {
			logger.error("Error in cleanUp()", e);
		}

	}
	
}

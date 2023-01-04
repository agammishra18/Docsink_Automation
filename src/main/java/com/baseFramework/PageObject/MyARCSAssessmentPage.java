package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class MyARCSAssessmentPage {

	private AppLibrary appLibrary;
	private WebDriver driver;

	String assessmentlocator = "xpath:-://td[text()='replace']";

	public MyARCSAssessmentPage(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public void verifyCreateMyAssessment(String assessmentName) throws Exception {

		AppLibrary.verifyElement(driver, assessmentlocator.replace("replace", assessmentName), true, 0);

	}
}

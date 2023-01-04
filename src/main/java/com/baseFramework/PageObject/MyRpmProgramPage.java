package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class MyRpmProgramPage {

	private AppLibrary appLibrary;
	private WebDriver driver;

	String rpmLocator = "xpath:-://td[text()='replace']";

	public MyRpmProgramPage(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public void verifyRpmProgram(String rpmName) throws Exception {

		AppLibrary.verifyElement(driver, rpmLocator.replace("replace", rpmName), true, 0);

	}
}

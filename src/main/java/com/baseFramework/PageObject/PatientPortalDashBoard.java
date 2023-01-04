package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class PatientPortalDashBoard {
	private AppLibrary appLibrary;
	private WebDriver driver;
	public String logo = "xpath:-://img[@id='main-logo']";
	public String setting = "xpath:-://span[text()='Settings']";

	public PatientPortalDashBoard(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public EditPatientProfile clickSetting() throws Exception {
		AppLibrary.clickElement(driver, setting);
		return new EditPatientProfile(appLibrary);
	}

	public void verifyLogo() throws Exception {
		AppLibrary.verifyElement(driver, logo, true, 2);
	}

}

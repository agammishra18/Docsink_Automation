package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.baseFramework.Lib.AppLibrary;

public class EditPatientProfileVerification {
	private AppLibrary appLibrary;
	private WebDriver driver;

	public String preferredName = "xpath:-://input[@id='preferred_name']";

	public EditPatientProfileVerification(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public void editProfileVerify() throws Exception {

		String expectedPreferredName = "Potter";
		String actualPreferredName = AppLibrary.findElement(driver, preferredName).getAttribute("value").toString();
		Assert.assertEquals(actualPreferredName, expectedPreferredName);
	}
}

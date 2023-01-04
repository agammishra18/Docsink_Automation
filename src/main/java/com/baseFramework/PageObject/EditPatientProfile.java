package com.baseFramework.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class EditPatientProfile {

	private AppLibrary appLibrary;
	private WebDriver driver;

	public String preferredName = "xpath:-://input[@id='preferred_name']";
	public String phoneNumber = "xpath:-://input[@id='phone_number']";
	public String editIcon = "xpath:-://input[@type='file']";
	public String saveChangesButton = "xpath:-://button[@class='green-bg-btn']//span[text()='SAVE CHANGES']";
	public String address = "xpath:-://input[@id='address']";
	public String verifySuccessMessage = "xpath:-://div[text()='Account Details Updated Successfully']";

	public EditPatientProfile(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public EditPatientProfileVerification accountDetails() throws Exception {

		AppLibrary.findElement(driver, preferredName).sendKeys(Keys.CONTROL, "a");
		AppLibrary.findElement(driver, preferredName).sendKeys(Keys.DELETE);
		AppLibrary.enterText(driver, preferredName, "Potter");
		AppLibrary.enterText(driver, address, "88 street road");
		AppLibrary.clickElement(driver, saveChangesButton);
		AppLibrary.waitForPageToLoad(driver);
		
		return new EditPatientProfileVerification(appLibrary);
	}
}

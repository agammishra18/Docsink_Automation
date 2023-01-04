package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class ProviderPortalDashBoardPage {

	private AppLibrary appLibrary;
	private WebDriver driver;
	public String patients = "xpath:-://i[@class='fal fa-id-card']";
	public String addNewPatients = "xpath:-://a[@id='add-new-patient']";
	public String appAlert = "xpath:-://i[@class='fa fa-times']";

	public ProviderPortalDashBoardPage(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public ProviderPortalDashBoardPage clickPatients() throws Exception {

		AppLibrary.clickElement(driver, patients);
		return new ProviderPortalDashBoardPage(appLibrary);
	}

	public ProviderPortalDashBoardPage dismissAlert() throws Exception {
		AppLibrary.clickElement(driver, appAlert);
		AppLibrary.clickElement(driver, "xpath:-://a[@title='Close']");
		return new ProviderPortalDashBoardPage(appLibrary);
	}

	public PatientCreationFillDetailsPage clickAddNewPatients() throws Exception {
		AppLibrary.waitTillElementLoaded(driver, addNewPatients);
		AppLibrary.clickElement(driver, addNewPatients);
		return new PatientCreationFillDetailsPage(appLibrary);
	}

}

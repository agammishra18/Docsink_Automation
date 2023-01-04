package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class ProviderPortalTeamBuilderPage {

	private AppLibrary appLibrary;
	private WebDriver driver;

	public String teamBuilder = "xpath:-://span[text()='Team Builder']";
	public String cube = "xpath:-://i[@class='fal fa-cube']";
	public String patientMessangerApp = "xpath:-://span[text()='Patient Messenger']";
	public String chat = "xpath:-://i[@class='fal fa-comments']";

	public ProviderPortalTeamBuilderPage(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public void verifyLoginPageUi() throws Exception {

		AppLibrary.verifyElement(driver, teamBuilder, true, 0);
		AppLibrary.verifyElement(driver, cube, true, 0);
		AppLibrary.verifyElement(driver, patientMessangerApp, true, 0);

	}

	public ProviderPortalTeamBuilderPage clickCube() throws Exception {
		AppLibrary.clickElement(driver, cube);
		return new ProviderPortalTeamBuilderPage(appLibrary);

	}

	public PatientMessengerPage clickpatientMessangerApp() throws Exception {
		AppLibrary.clickElement(driver, patientMessangerApp);
		return new PatientMessengerPage(appLibrary);
	}

	public ProviderPortalDashBoardPage clickChat() throws Exception {
		AppLibrary.clickElement(driver, chat);
		return new ProviderPortalDashBoardPage(appLibrary);
	}
}

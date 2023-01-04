package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class ProviderPortalLoginPage {

	private AppLibrary appLibrary;
	private WebDriver driver;

	public String emailInput = "xpath:-://input[@id='email']";
	public String passwordInput = "xpath:-://input[@id='password']";
	public String signInButton = "xpath:-://button[text()='Sign in']";

	public ProviderPortalLoginPage(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public void verifyLoginPageUi() throws Exception {
		AppLibrary.verifyElement(driver, emailInput, true, 0);
		AppLibrary.verifyElement(driver, passwordInput, true, 0);
		AppLibrary.verifyElement(driver, signInButton, true, 0);

	}

	public ProviderPortalTeamBuilderPage fillLoginDetails(String email, String pass) throws Exception {
		AppLibrary.enterText(driver, emailInput, email);
		AppLibrary.enterText(driver, passwordInput, pass);
		AppLibrary.clickElement(driver, signInButton);
		return new ProviderPortalTeamBuilderPage(appLibrary);

	}

}

package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class PatientMessengerPage {

	private AppLibrary appLibrary;
	private WebDriver driver;
	public String RPM = "xpath:-://span[text()='Remote Patient Monitoring Program']";
	public String ARCS = "xpath:-://span[text()='ARCS']";

	public PatientMessengerPage(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public ARCSAssessmentCreationPage clickARCS() throws Exception {
		AppLibrary.clickElement(driver, ARCS);
		return new ARCSAssessmentCreationPage(appLibrary);
	}

	public RpmProgramCreationPage clickRPM() throws Exception {
		AppLibrary.clickElement(driver, RPM);
		return new RpmProgramCreationPage(appLibrary);
	}

}

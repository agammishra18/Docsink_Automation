package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class ARCSAssessmentCreationPage {

	private AppLibrary appLibrary;
	private WebDriver driver;

	public String createARCS = "xpath:-://span[@data-i18n='nav.deviceless_rpm']";
	public String title = "xpath:-://input[@placeholder='Title']";
	public String surveyFlag = "xpath:-://select[@id='survey_flag']";
	public String surveyFlagSelect = "xpath:-://select[@id='survey_flag']//option[text()='ARCS Kidney']";
	public String description = "xpath:-://textarea[@placeholder='Description']";
	public String conditions = "xpath:-://input[@placeholder='Search to find an ICD 10 Diagnosis code']";
	public String conditionSelect = "xpath:-://li[text()='N15.1 - Kidney abscess']";
	public String okButton = "xpath:-://button[text()='OK']";
	public String nextbutton = "xpath:-://button[text()='Next']";
	public String addquestions = "xpath:-://button[normalize-space()='Add Question']";
	public String medicalFollowUp = "xpath:-://button[@id='medication_follow_up']";
	public String saveButton = "xpath:-://form[@id='quesForm_deviceless_rpm1']//button[contains(@type,'button')][normalize-space()='Save']";
	public String switchMonday = "xpath:-:xpath:-://label[normalize-space()='Monday']//span[contains(@class,'checkmark')]";
	public String mondayAllDay = "xpath:-://label[contains(@for,'mon_all_day')]";
	public String browserTest = "xpath:-://label[normalize-space()='accept']";
	public String smsTest = "xpath:-://form[@id='surveyType']//label[contains(@class,'form-label')][normalize-space()='SMS']//span[@class='checkmark']";
	public String voiceTest = "xpath:-://div[@role='form']//div//div//form//div//div//label[contains(text(),'Voice')]//span";
	public String finishButton = "xpath:-://button[text()='Finish']";
	public String inactive = "xpath:-://div[@data-id='NjAzNA==']//div[text()='Inactive']";
	public String myAssessmentLocator = "xpath:-://table[1]/tbody/tr[1]/td[1]";

	public ARCSAssessmentCreationPage(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();

	}

	public void verifyARCSAssessmentCreationPageUi() throws Exception {

		AppLibrary.verifyElement(driver, createARCS, true, 0);
		AppLibrary.verifyElement(driver, title, true, 0);
		AppLibrary.verifyElement(driver, surveyFlag, true, 0);
		AppLibrary.verifyElement(driver, surveyFlagSelect, true, 0);
		AppLibrary.verifyElement(driver, description, true, 0);

	}

	public ARCSAssessmentCreationPage clickCreateARCS() throws Exception {
		AppLibrary.clickElement(driver, createARCS);
		return new ARCSAssessmentCreationPage(appLibrary);

	}

	public MyARCSAssessmentPage createARCSAssessment(String AssessmentName) throws Exception {

		AppLibrary.enterText(driver, title, AssessmentName);
		AppLibrary.clickElement(driver,surveyFlag);
		AppLibrary.clickElement(driver,surveyFlagSelect);
		AppLibrary.enterText(driver,description, "Kidney is not working as ");
		AppLibrary.enterText(driver,conditions, "Kid");
		AppLibrary.clickElement(driver,conditionSelect);
		AppLibrary.clickElement(driver,nextbutton);
		AppLibrary.clickElement(driver,okButton);
		AppLibrary.clickElement(driver,smsTest);
		AppLibrary.clickElement(driver,voiceTest);
		AppLibrary.clickElement(driver,nextbutton);
		AppLibrary.clickElement(driver,okButton);
		AppLibrary.clickElement(driver,nextbutton);
		AppLibrary.clickElement(driver,addquestions);
		AppLibrary.clickElement(driver,medicalFollowUp);
		AppLibrary.clickElement(driver,saveButton);
		AppLibrary.clickElement(driver,okButton);
		AppLibrary.clickElement(driver,nextbutton);
		AppLibrary.clickElement(driver,nextbutton);
		AppLibrary.waitTillElementLoaded(driver,okButton);
		AppLibrary.clickElement(driver,okButton);
		AppLibrary.clickElement(driver,browserTest);
		AppLibrary.clickElement(driver,finishButton);
		return new MyARCSAssessmentPage(appLibrary);

	}

}

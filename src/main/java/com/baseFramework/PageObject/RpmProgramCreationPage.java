package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class RpmProgramCreationPage {

	private AppLibrary appLibrary;
	private WebDriver driver;
	public String rpm = "xpath:-://span[text()='Remote Patient Monitoring Program']";
	public String createRPM = "xpath:-://span[normalize-space()='Create RPM Program']";
	public String title = "xpath:-://input[@id='rpm_title']";
	public String provider = "xpath:-: //span[@id='select2-rpm_user-container']";
	public String selectProvider = "xpath:-: //li[text()='Ashley Williams']";
	public String description = "xpath:-://textarea[@placeholder='Description']";
	public String conditions = "xpath:-://input[@placeholder='Search to find an ICD 10 Diagnosis code']";
	public String conditionSelect = "xpath:-://li[text()='N15.1 - Kidney abscess']";
	public String rpmFlag = "xpath:-://select[@id='rpm_flag']";
	public String rpmWorkFlow = "//select[@id='rpm_workflows']";
	public String addCoverImag = "xpath:-: //span[@class='mb-1 fs-xl pointr addCoverImg']//i[@class='fal fa-plus-circle ml-2']";
	public String coverImagSelect = "xpath:-://div[@id='addImages']//span[1]//img[1]";
	public String item = "xpath:-://span[@id='select2-rpm_items-container']";
	public String bp = "xpath:-://li[text()='replace']";
	public String selectItem = "xpath:-://th[normalize-space()='Model']";
	public String highValue = "xpath:-://input[@placeholder='High value']";
	public String lowValue = "xpath:-://input[@placeholder='Low value']";
	public String addDevice = "xpath:-://a[@id='add-device-btn']";
	public String selectAll = "xpath:-://label[@for='ckbCheckAll']";
	public String saveButton = "xpath:-://div[button[text()='Close']]/button[text()='Save']";
	public String rpmProgramPageSaveButton = "xpath:-://div[div[@id='rpm-view']]//button[text()='Save']";
	public String rpmAssessmentName = "xpath:-://table[1]/tbody/tr[1]/td[1]";

	public RpmProgramCreationPage(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public void verifyLoginPageUi() throws Exception {
		AppLibrary.verifyElement(driver, rpm, true, 0);
		AppLibrary.verifyElement(driver, createRPM, true, 0);
		AppLibrary.verifyElement(driver, title, true, 0);
		AppLibrary.verifyElement(driver, provider, true, 0);
		AppLibrary.verifyElement(driver, selectProvider, true, 0);
		AppLibrary.verifyElement(driver, description, true, 0);
	}

	public RpmProgramCreationPage clickRPM() throws Exception {
		AppLibrary.clickElement(driver, rpm);
		return new RpmProgramCreationPage(appLibrary);
	}

	public RpmProgramCreationPage clickCreateRPM() throws Exception {
		AppLibrary.clickElement(driver, createRPM);
		return new RpmProgramCreationPage(appLibrary);

	}

	public MyRpmProgramPage createRpmProgram(String rpmName) throws Exception {
		AppLibrary.enterText(driver, title, rpmName);
		AppLibrary.clickElement(driver, provider);
		AppLibrary.clickElement(driver, selectProvider);
		AppLibrary.enterText(driver, conditions, "Kid");
		AppLibrary.clickElement(driver, conditionSelect);
		AppLibrary.clickElement(driver, rpmFlag);
		AppLibrary.enterText(driver, description, "Kidney is not working as ");
		AppLibrary.selectOption(driver, rpmWorkFlow, 1);
		AppLibrary.clickElement(driver, addCoverImag);
		AppLibrary.clickElement(driver, coverImagSelect);
		AppLibrary.clickElement(driver, item);
		AppLibrary.clickElement(driver, bp.replace("replace", "Blood Glucose"));
//		AppLibrary.dropDown(driver);
		AppLibrary.enterText(driver, highValue, "160");
		AppLibrary.enterText(driver, lowValue, "90");
		AppLibrary.clickElement(driver, addDevice);
		AppLibrary.clickElement(driver, selectAll);
		AppLibrary.waitTillElementClickable(driver, saveButton);
		AppLibrary.clickElement(driver, saveButton);
		AppLibrary.waitTillElementLoaded(driver, rpmProgramPageSaveButton);
		AppLibrary.clickElement(driver, rpmProgramPageSaveButton);
		return new MyRpmProgramPage(appLibrary);
	}

	
	
}

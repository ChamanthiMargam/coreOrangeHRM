package com.Pages;

import org.openqa.selenium.By;

import com.Util.CommonUtils;

public class PIMPage {
	
	private final static By by_pim=By.xpath("/html/body/div[4]/ul/li[2]/a/span");
	private final static By by_employee_list=By.xpath("/html/body/div[4]/ul/li[2]/ul/li[1]/a/span");
	private final static By by_add_employee=By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span");
	private final static By by_back_button=By.className("backbutton");
	private final static By by_frame=By.xpath("//iframe[@id='rightMenu']");
	private final static By by_lastname=By.xpath("//*[@id=\"txtEmpLastName\"]");
	private final static By by_firstname=By.xpath("//input[@id='txtEmpFirstName']");
	private final static By by_browse=By.xpath("//*[@id=\"photofile\"]");
	private final static By by_save=By.id("btnEdit");
	private final static By by_pim_addEmp=By.xpath("/html/body/form/div/div[1]/div[2]/div[1]/h2");
	private final static By by_emp_info=By.xpath("/html/body/div/div[2]/form/div[1]/h2");
	private final static By by_search_by=By.id("loc_code");
	private final static By by_search_for=By.id("loc_name");
	private final static By by_search=By.className("plainbtn");
	private final static By by_addbutton=By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]");
	private final static By by_edit_button=By.id("btnEditPers");
	private final static By by_middle_name=By.id("txtEmpMiddleName");
	private final static By by_edit_save=By.xpath("/html/body/form/div[20]/div[1]/div[2]/div[2]/div/input");
	private final static By by_checkbox=By.name("chkLocID[]");
	private final static By by_searchemp = By.xpath("/html/body/div/div[2]/form/table/tbody/tr/td[3]/a");
	private final static By by_deletebutton=By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[2]");
	private final static By by_del_msg=By.xpath("//*[@id=\"standardView\"]/div[2]/span");
	private final static By by_norecords=By.xpath("/html/body/div/div[2]/form/table/tbody/tr/td");
	private final static By by_choose_photo=By.xpath("//*[@id=\"photo\"]/div[1]/div[2]/div[2]/label[1]");
	private final static By by_click_on_photo=By.xpath("//*[@id=\"photodiv\"]/img");
	private final static By by_current_image=By.id("currentImage");
	private final static By by_personal_details=By.xpath("//*[@id=\"personal\"]/div[1]/div[2]/div[1]/h2");
	private final static By	by_job=By.xpath("//*[@id=\"jobLink\"]/span");
	private final static By by_emp_status_list=By.xpath("//*[@id=\"cmbType\"]");
	private final static By by_emp_status=By.id("cmbType");
	private final static By by_job_edit=By.xpath("//*[@id=\"btnEditJob\"]");
	private final static By by_job_save=By.id("btnEditJob");
	private final static By by_verifyempstatus=By.xpath("/html/body/div/div[2]/form/table/tbody/tr/td[5]/a");
	
	public static void clickOnElement() throws Exception {
		CommonUtils.clickElement(getPim());
	}
	
	
	public static By getPim() throws Exception{
		return by_pim;
	}
	public static  By getEmployeeList() {
		return by_employee_list;
	}

	public static  By getAddEmployee() {
		return by_add_employee;
	}
	public static  By getBack() {
		return by_back_button;
	}
	public static By getFrame() {
		return by_frame;
	}
	
	public static  By getLastName() {
		return by_lastname;	
	}
	public static  By getFirstName() {
		return by_firstname;
	}
	
	public static By getBrowse() {
		return by_browse;
	}
	public static  By getSave() {
		return by_save;
	}
	public static  By getAddEmpText() {
		return by_pim_addEmp;
	}
	
	public static By getEmpInfo() {
		return by_emp_info;
	}
	
	public static By getSearch() {
		return by_search;
	}

	public static By getSearchFor() {
		
		return by_search_for;
	}
	public static By getSearchBy() {
		return by_search_by;
	}
	
	public static By getAddButton() {
		return by_addbutton;
	}


	public static By getEditButton() {
		return by_edit_button;
	}

	public static By getMiddleName() {
		return by_middle_name;
	}


	public static By getEmpName(String empname) {
		
		By by_empname=By.linkText(empname);
		return by_empname;
	}


	public static By getSearchedEmployee() {
		return by_searchemp;
	}
	
	public static By getEditSave() {
		return by_edit_save;
	}


	public static By getCheckbox() {
	
		return by_checkbox;
	}


	public static By getDeleteButton() {
	    return by_deletebutton;
		
	}


	public static By getConfirmDeleteButton() {
		return by_del_msg;
	}


	public static By getNoRecordsFound() {
		return by_norecords;

	}


	public static By getChoosePhoto() {
		return by_choose_photo;
		
	}


	public static By getClickOnPhoto() {
		return by_click_on_photo;
		
	
	}


	public static By getCurrentImage() {
		return by_current_image;
	}
	
	
	public static By getPersonalDetails() {
		return by_personal_details;
	}
	
	public static By getJob() {
		return by_job;
	}
	
	public static By getEmpStatusList() {
		return by_emp_status_list;
	}
	
	public static By getEmpStatus() {
		return by_emp_status;
	}
	
	public static By getJobEdit() {
		return by_job_edit;
	}


	public static By getJobSave() {
		return by_job_save;
	}


	public static By getVerifyEmpStatus() {
		return by_verifyempstatus;
	}
	
}

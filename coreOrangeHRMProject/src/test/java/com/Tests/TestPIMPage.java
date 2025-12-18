package com.Tests;

import org.testng.annotations.Test;

import com.Base.BasePage;
import com.Pages.LoginPage;
import com.Pages.LogoutPage;
import com.Pages.PIMPage;
import com.Util.CommonUtils;
import com.Util.TestNGUtility;

public class TestPIMPage extends BasePage {
	
	
	@Test(description="Verify login page",enabled=true,priority=0)
	public void verifyLoginPage() throws Exception {
		LoginPage.login();
		TestNGUtility.assertTrue(CommonUtils.getElementText(LoginPage.getWelcomePage()), "Welcome selenium");
		CommonUtils.hardWait(2);
		CommonUtils.moveToElement(PIMPage.getPim());
	}

	
@Test(description="Verify that an employee can be added successfully",dependsOnMethods= {"verifyLoginPage()"},enabled=false,priority=1)
	
	public void addEmployeeThenVerify() throws Exception  {
		
		
		CommonUtils.clickElement(PIMPage.getAddEmployee());
		
		CommonUtils.switchToFrame(PIMPage.getFrame());
		CommonUtils.hardWait(2);
		TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getAddEmpText()), "PIM : Add Employee");
		CommonUtils.hardWait(2);
		
		CommonUtils.enterValue(PIMPage.getLastName(), "Chamanthi", true);
		CommonUtils.hardWait(2);
		
		CommonUtils.enterValue(PIMPage.getFirstName(), "DSU", true);
		
		CommonUtils.hardWait(2);
		
		CommonUtils.clickElement(PIMPage.getSave());
		
		CommonUtils.clickElement(PIMPage.getBack());
		CommonUtils.switchBackToFrame();
		CommonUtils.hardWait(2);
		CommonUtils.clickElement(LogoutPage.getLogout());
		}


@Test(description="Edit employee and then verify",dependsOnMethods= {"verifyLoginPage()"},enabled=false,priority=2)
public void editEmployeeThenVerify() throws Exception
{

	CommonUtils.clickElement(PIMPage.getEmployeeList());
	CommonUtils.switchToFrame(PIMPage.getFrame());
	CommonUtils.hardWait(2);
	
	TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getEmpInfo()), "Employee Information");
	CommonUtils.searchByList(PIMPage.getSearchBy(), "Emp. First Name");
	
	CommonUtils.enterValue(PIMPage.getSearchFor(), "Sahasra", true);
	CommonUtils.clickElement(PIMPage.getSearch());
	CommonUtils.hardWait(2);
	
	CommonUtils.clickElement(PIMPage.getSearchedEmployee());
	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getEditButton());
	CommonUtils.hardWait(2);
	
	CommonUtils.clearWholeText(PIMPage.getMiddleName());
	CommonUtils.enterValue(PIMPage.getMiddleName(), "DSU", true);
	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getEditSave());
	CommonUtils.hardWait(2);
	
	CommonUtils.clickElement(PIMPage.getBack());
	
	CommonUtils.verifyUpdatedValueInList(PIMPage.getSearchBy(), PIMPage.getSearchFor(), "Sahasra");
	
	CommonUtils.switchBackToFrame();
	CommonUtils.clickElement(LogoutPage.getLogout());
	
}
@Test(description="View employee list",dependsOnMethods= {"verifyLoginPage()"},enabled=false,priority=3)
public void viewEmployeeList() throws Exception
{
	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getEmployeeList());
	CommonUtils.switchToFrame(PIMPage.getFrame());
	CommonUtils.hardWait(2);
	TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getEmpInfo()), "Employee Information");
	CommonUtils.switchBackToFrame();
	CommonUtils.clickElement(LogoutPage.getLogout());
	
}

@Test(description="Search for an employee and then verify",dependsOnMethods= {"verifyLoginPage()"},enabled=false,priority=4)
public void searchEmployeeThenVerify() throws Exception {

	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getEmployeeList());

	CommonUtils.switchToFrame(PIMPage.getFrame());
	CommonUtils.hardWait(2);
	TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getEmpInfo()), "Employee Information");
	CommonUtils.searchByList(PIMPage.getSearchBy(), "Emp. First Name");

	CommonUtils.enterValue(PIMPage.getSearchFor(), "Dhanush", true);
	CommonUtils.clickElement(PIMPage.getSearch());

	CommonUtils.getElementText(PIMPage.getSearchedEmployee());
	
	CommonUtils.switchBackToFrame();
	CommonUtils.clickElement(LogoutPage.getLogout());

}

@Test(description="Delete an employee and then verify",dependsOnMethods= {"verifyLoginPage()"},enabled=false,priority=5)
public void deleteEmployeeThenVerify() throws Exception {
	
	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getEmployeeList());

	CommonUtils.switchToFrame(PIMPage.getFrame());
	CommonUtils.hardWait(2);
	TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getEmpInfo()), "Employee Information");
	CommonUtils.searchByList(PIMPage.getSearchBy(), "Emp. First Name");

	CommonUtils.enterValue(PIMPage.getSearchFor(), "Sahasra", true);
	CommonUtils.clickElement(PIMPage.getSearch());

	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getCheckbox());
	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getDeleteButton());
	CommonUtils.hardWait(2);
	
	TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getConfirmDeleteButton()),"Successfully Deleted");

	// Verify deletion
	CommonUtils.searchByList(PIMPage.getSearchBy(), "Emp. First Name");
	CommonUtils.enterValue(PIMPage.getSearchFor(), "Sahasra", true);
	CommonUtils.clearWholeText(PIMPage.getSearchFor());
	CommonUtils.clickElement(PIMPage.getSearch());
	
	String noRecordsText = CommonUtils.getElementText(PIMPage.getNoRecordsFound());
	TestNGUtility.assertTrue(noRecordsText, "No Records Found");
	
	
	CommonUtils.switchBackToFrame();
	CommonUtils.clickElement(LogoutPage.getLogout());

}


@Test(description="Import Employee data",dependsOnMethods= {"verifyLoginPage()"},enabled=false,priority=6)
public static void addMultipleEmployeesUsingExcel() throws Exception
{
	
	CommonUtils.clickElement(PIMPage.getAddEmployee());
	
	CommonUtils.switchToFrame(PIMPage.getFrame());
	CommonUtils.hardWait(2);
	TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getAddEmpText()), "PIM : Add Employee");
	CommonUtils.hardWait(2);
	
	CommonUtils.addMultipleEmployees("AddMultipleEmployees");
	
}

@Test(description="Add employee photo and then verify",dependsOnMethods= {"verifyLoginPage()"},enabled=false,priority=7)
public void addEmployeePhotoThenVerify() throws Exception {

	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getEmployeeList());

	CommonUtils.switchToFrame(PIMPage.getFrame());
	CommonUtils.hardWait(2);
	TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getEmpInfo()), "Employee Information");
	CommonUtils.searchByList(PIMPage.getSearchBy(), "Emp. First Name");

	CommonUtils.enterValue(PIMPage.getSearchFor(), "Dhanush", true);
	CommonUtils.clickElement(PIMPage.getSearch());

	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getSearchedEmployee());
	CommonUtils.hardWait(2);

	CommonUtils.uploadPhoto("photo");

	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getEditSave());
	CommonUtils.hardWait(2);

	CommonUtils.switchBackToFrame();
	CommonUtils.clickElement(LogoutPage.getLogout());

}


@Test(description="View employee details",dependsOnMethods= {"verifyLoginPage()"},enabled=false,priority=8)
public void searchEmployee() throws Exception
{
	
	CommonUtils.clickElement(PIMPage.getEmployeeList());
	
	CommonUtils.switchToFrame(PIMPage.getFrame());
	CommonUtils.hardWait(2);
	TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getEmpInfo()), "Employee Information");
	CommonUtils.searchByList(PIMPage.getSearchBy(), "Emp. First Name");
	
	CommonUtils.enterValue(PIMPage.getSearchFor(), "Chamanthi", true);
	CommonUtils.clickElement(PIMPage.getSearch());
	CommonUtils.hardWait(2);
	
	CommonUtils.clickElement(PIMPage.getSearchedEmployee());
	CommonUtils.hardWait(2);
	TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getPersonalDetails()), "Personal Details");
	CommonUtils.clickElement(PIMPage.getBack());
	
	CommonUtils.switchBackToFrame();
	CommonUtils.clickElement(LogoutPage.getLogout());
			
}


@Test(description="Edit employee status and then verify",dependsOnMethods= {"verifyLoginPage()"},enabled=true,priority=9)
public void editEmployeeStatusThenVerify() throws Exception
{
		
	CommonUtils.clickElement(PIMPage.getEmployeeList());
	CommonUtils.switchToFrame(PIMPage.getFrame());
	CommonUtils.hardWait(2);
	
	TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getEmpInfo()), "Employee Information");
	CommonUtils.searchByList(PIMPage.getSearchBy(), "Emp. First Name");
	CommonUtils.enterValue(PIMPage.getSearchFor(), "Chamanthi", true);
	CommonUtils.clickElement(PIMPage.getSearch());
	CommonUtils.hardWait(2);
	
	CommonUtils.clickElement(PIMPage.getSearchedEmployee());
	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getJob());
	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getJobEdit());
	
	CommonUtils.searchByList(PIMPage.getEmpStatus(), "Full Time Permanent");
	CommonUtils.hardWait(2);
	CommonUtils.clickElement(PIMPage.getJobSave());
	CommonUtils.hardWait(2);
	
	CommonUtils.clickElement(PIMPage.getBack());
	CommonUtils.hardWait(2);
	
	TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getVerifyEmpStatus()), "Full Time Permanent");
	CommonUtils.switchBackToFrame();
	CommonUtils.clickElement(LogoutPage.getLogout());
	
}
}



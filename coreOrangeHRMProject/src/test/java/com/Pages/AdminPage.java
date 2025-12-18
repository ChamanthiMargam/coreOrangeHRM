package com.Pages;

import org.openqa.selenium.By;


public class AdminPage {
	private final static By by_admin=By.xpath("//*[@id=\"admin\"]/a/span");
	private final static By by_job=By.xpath("//*[@id=\"admin\"]/ul/li[2]/a/span");
	private final static By by_emeployee_status=By.xpath("//*[@id=\"admin\"]/ul/li[2]/ul/li[4]/a/span");

public static By getAdmin() {
    return by_admin;
}

public static By getJob() {
    return by_job;
}

public static By getEmployeeStatus() {
    return by_emeployee_status;
}





}

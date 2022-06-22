package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibraryClass;
import com.morningstar.ReusableFunction;

public class SearchAdminPage extends LibraryClass{
	
	@FindBy(id = "searchSystemUser_userName")
	WebElement searchUsername;
	@FindBy(id = "searchSystemUser_userType")
	WebElement userRole;
	@FindBy(id = "searchSystemUser_employeeName_empName")
	WebElement employeeName;
	@FindBy(id="searchSystemUser_status")
	WebElement employeeStatus;
	@FindBy(id="searchBtn")
	WebElement searchButton;
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement module;
	
	public SearchAdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void search(String uname, String element,String eName,String element1) {
		
		ReusableFunction reuse=new ReusableFunction(driver);
		reuse.mouseMove(module);
		searchUsername.sendKeys(uname);
		reuse.dropdown(userRole, element);
		employeeName.sendKeys(eName);
		reuse.dropdown(employeeStatus, element1);
		searchButton.click();
	}
}

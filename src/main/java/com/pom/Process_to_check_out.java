package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Process_to_check_out {
	public static WebDriver driver;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement procedureclick;
	public Process_to_check_out(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getProcedureclick() {
		return procedureclick;
	}
}

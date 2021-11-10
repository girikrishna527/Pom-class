package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public static WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement nameclick;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passclick;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement si2;

	public Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public static WebDriver getDriver() {
		return driver;
	}


	
	public WebElement getNameclick() {
		return nameclick;
	}

	public WebElement getPassclick() {
		return passclick;
	}

	public WebElement getSi2() {
		return si2;
	}
}

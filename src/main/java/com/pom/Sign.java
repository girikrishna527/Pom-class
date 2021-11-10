package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	public static WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceclick;
	

	public Sign(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public static WebDriver getDriver() {
		return driver;
	}




	public WebElement getProceclick() {
		return proceclick;
	}

}

package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public static WebDriver driver;
	@FindBy(xpath="//a[@title='Women']")
	private WebElement womenclick;
	
	@FindBy(xpath="//a[@title='T-shirts']")
	private WebElement tshirtclisk;

	@FindBy (xpath="//img[@width='250']")
	private WebElement imgclick;
	
	public Home_page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomenclick() {
		return womenclick;
	}

	public WebElement getTshirtclisk() {
		return tshirtclisk;
	}

	public WebElement getImgclick() {
		return imgclick;
	}
	
}



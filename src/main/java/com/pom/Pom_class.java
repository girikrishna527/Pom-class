package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {
	 public static WebDriver driver;

		
		@FindBy(name="processAddress")
		private WebElement proceclick;
	

	@FindBy(name="cgv")
	private WebElement proce2click;
	
	@FindBy(name="processCarrier")
	private WebElement proce3click;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement siclick;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement endclick;

	public Pom_class(WebDriver driver2) {
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

	public WebElement getProce2click() {
		return proce2click;
	}

	public WebElement getProce3click() {
		return proce3click;
	}

	public WebElement getSiclick() {
		return siclick;
	}

	public WebElement getEndclick() {
		return endclick;
	}
	


	}
	

	



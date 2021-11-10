package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcart {
	public static WebDriver driver;
	@FindBy(xpath="//a[@title='Add to cart']")
	private WebElement cartclick;

	public Addcart(WebDriver dri) {
		this.driver=dri;
		PageFactory.initElements(driver,this );
		// TODO Auto-generated constructor stub
	}

	public WebElement getCartclick() {
		return cartclick;
	}

}

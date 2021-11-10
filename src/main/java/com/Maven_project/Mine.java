package com.Maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mine {
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		// TODO Auto-generated method stub
		else {
			System.out.println("not valid");
		}
	
return driver;
	}

	public static void clickonElement(WebElement element) {
		// TODO Auto-generated method stub
element.click();
	}
	public static void inputvalueElement(WebElement element, String value) {
	element.sendKeys(value);
	}
	public static void getURL(String url) {
		// TODO Auto-generated method stub
driver.get(url);
	}
	public static void closepage() {
		// TODO Auto-generated method stub
driver.close();

	}
	public static void quitpage() {
		// TODO Auto-generated method stub
		driver.quit();

	}
	

}

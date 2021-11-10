package com.Maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb extends Mine {
	public static void main(String[] argy){
		getBrowser("chrome");
		
		getURL("https://www.facebook.com/login/");
		
		
		WebElement email =driver.findElement(By.name("email"));
		//email.sendKeys("girikrishna527");
		inputvalueElement(email,"girikrishna527");
		
		
		WebElement pass =driver.findElement(By.name("pass"));
		//pass.sendKeys("girikrishna");
		inputvalueElement(pass,"girikrishna");
		
		
		WebElement sing =driver.findElement(By.xpath("//button[@name='login']"));
	//sing.click();	
		clickonElement(sing);
	quitpage();
	}

}

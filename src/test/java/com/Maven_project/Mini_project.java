package com.Maven_project;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_project extends Base_class {

	public static void main(String[] args) throws Throwable {
		getbrowswer("chrome");
		geturl("http://automationpractice.com");
	
	
		
	impWait();
	
		WebElement Women = driver.findElement(By.xpath("//a[@title='Women']"));
		clickonElement(Women);
		
		WebElement tshirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
		clickonElement(tshirt);
		impWait();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)","");
		impWait();
		WebElement img = driver.findElement(By.xpath("//img[@width='250']"));
		clickonElement(img);
		
		WebElement cart = driver.findElement(By.name("Submit"));
		clickonElement(cart);
		
		WebElement procedure = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickonElement(procedure);
		
	//	js.executeScript("window.scrollBy(0,800)","");
		
		WebElement sign = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickonElement(sign);
		
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		inputsend(name,"girikrishna527@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		inputsend(pass,"girikrishna");
		
		WebElement si2 = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickonElement(si2);
	
		WebElement proce = driver.findElement(By.name("processAddress"));
		clickonElement(proce);
		
		WebElement proce2 = driver.findElement(By.name("cgv"));
		clickonElement(proce2);
		
		WebElement proce3 = driver.findElement(By.name("processCarrier"));
		clickonElement(proce3);
		
		WebElement si = driver.findElement(By.xpath("//a[@class='bankwire']"));
		clickonElement(si);
		
				WebElement end = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
				clickonElement(end);
				
				//js.executeScript("window.scrollBy(0,500)","");
				//TakesScreenshot ts=(TakesScreenshot)driver;
				//File source= ts.getScreenshotAs(OutputType.FILE);
				//File dc = new File("C:\\Users\\V.Giri krishna\\eclipse-workspace\\Java\\ScreenShoot\\img.png");
			//	FileUtils.copyFile(source,dc);
				
				
		
				
	}

	}

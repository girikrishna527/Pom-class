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

public class Project2 extends Base_class{
	public static void main(String[] args) throws Throwable {
		getbrowswer("chrome");
		geturl("http://automationpractice.com");
		impWait();
		
		WebElement Women = driver.findElement(By.xpath("//a[@title='Women']"));
		actionClass("moveto", Women);
		WebElement tshirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
		actionClass("click", tshirt);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)","");
		WebElement img = driver.findElement(By.xpath("//img[@width='250']"));
		actionClass("moveto", img);
		WebElement cart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		actionClass("click", cart);
		WebElement procedure = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickonElement(procedure);
		//js.executeScript("window.scrollBy(0,800)","");
		//scrollUpandDown(procedure);
		WebElement sign = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickonElement(sign);
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		inputsend(name, "girikrishna527@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		inputsend(pass, "girikrishna");
		WebElement si2 = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickonElement(si2);
		//WebElement email = driver.findElement(By.name("email"));
		//email.sendKeys("girikrishna527@gmail.com");
		//WebElement pass1 = driver.findElement(By.name("passwd"));
		//pass1.sendKeys("girikrishna");
		//WebElement si = driver.findElement(By.name("SubmitLogin"));
		//si.click();
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
		js.executeScript("window.scrollBy(0,500)","");
			
				//TakesScreenshot ts=(TakesScreenshot)driver;
		//File source= ts.getScreenshotAs(OutputType.FILE);
		//File dc = new File("C:\\Users\\V.Giri krishna\\eclipse-workspace\\Java\\ScreenShoot\\img.png");
				//FileUtils.copyFile(source,dc);
				//TakesScreenshot tc = (TakesScreenshot) driver;
				//File sor = ts.getScreenshotAs(OutputType.FILE);
				//File d = new ("C:\\Users\\V.Giri krishna\\eclipse-workspace\\Java\\Screenshot//img.png");
				//FileUtils.copyFile(sor, d);
				
		
				
	}

}

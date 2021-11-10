package com.Maven_project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {
	public static WebDriver driver;
	public static WebDriver getbrowswer(String type) {
		try {
			if (type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\V.Giri krishna\\eclipse-workspace\\Maven_project\\Driver\\chromedriver.exe");
						//System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

				driver = new ChromeDriver();
			}
			else if (type.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\firefoxdriver.exe");
               driver= new FirefoxDriver();}
               else if (type.equalsIgnoreCase("ie")) {
            	   System.setProperty("webdriver.ie.driver",
   						System.getProperty("user.dir") + "\\Driver\\IEDDriverServer.exe");
                  driver= new InternetExplorerDriver();}	
			
			
			else {
				System.out.println("not valied");
			}
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void geturl(String url) {
		try {
			
		driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void ImpWait() {
		try {
			
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
private void navigate(String url) {
	try {
	driver.navigate().to("");	
	} catch (Exception e) {
		e.printStackTrace();
	}

}
private void navigateBack(String url) {
	try {
		driver.navigate().back();
	} catch (Exception e) {
		e.printStackTrace();
	}

}
private void navigateForward() {
	try {
	driver.navigate().forward();	
	} catch (Exception e) {
		e.printStackTrace();
	}

}
	public static void clickonElement(WebElement element) {
		try {
			element.click();
		} catch (Exception a) {
			a.printStackTrace();
		}
	}

	public static void inputsend(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception b) {
			b.printStackTrace();
		}
	}

	public static void sleep(int milliseconds) throws InterruptedException {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception b) {
			b.printStackTrace();
		}
	}

	public static void scrollUpandDown(WebElement element) {
		// TODO Auto-generated method stub
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("argumens[0].scrollIntoView();", element);
		} catch (Exception b) {
			b.printStackTrace();
		}
	}

	public static void actionClass(String actionName, WebElement element) {
		try {
			Actions ac = new Actions(driver);
			if (actionName.equalsIgnoreCase("moveto")) {
				ac.moveToElement(element).build().perform();
			} else if (actionName.equalsIgnoreCase("clickon")) {
				ac.click(element).build().perform();

			} else if (actionName.equalsIgnoreCase("click")) {
				ac.click(element).build().perform();

			} else if (actionName.equalsIgnoreCase("doubleClick")) {
				ac.contextClick(element).build().perform();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void drapDown(String type, WebElement element, String value) {
		try {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("by value")) {
				s.selectByValue(value);
			}
			else if (type.equalsIgnoreCase("byvisibileText")) {
				s.selectByVisibleText(value);

			} else if (type.equalsIgnoreCase("byIndex")) {
				int data = Integer.parseInt(value);
				s.selectByIndex(data);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public static void getAttributr(By bysearchButton) {
	
WebElement element = driver.findElement(bysearchButton);
System.out.println(element);
}
	public static void getCurrentUrl( String element) {
	try {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	} catch (Exception e) {
	e.printStackTrace();
	}
	
}
	
	public static  void getText(WebElement element) {
	try {
		String text = element.getText();
		
		System.out.println(text);}
	catch (Exception e) {
		e.printStackTrace();
	}
	}

	public static void getisEnable(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

	public static  void getisDisplayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

public static void getisSelected(WebElement element) {
	try {
		 element.isSelected();
	} catch (Exception e) {
	e.printStackTrace();
	}

}

//public static  void gettakesScreenshot() throws IOException{
	//TakesScreenshot ts = (TakesScreenshot) driver;
	//File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	//File file =new File("C:\\Users\\V.Giri krishna\\eclipse-workspace\\Java\\ScreenShoot");
	//FileUtils.copyFile(screenshotAs,file);

//}
//implicitewait
public static void impWait() {
	try {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	} catch (Exception e) {
		e.printStackTrace();
	}

}
//expliciwait
public static void expWait(long seconds,WebElement element) {
	try {
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.invisibilityOf(element));
	} catch (Exception e) {
	e.printStackTrace();
	}


}//public static void screenshoot(String pic) throws IOException {
	//TakesScreenshot tk = (TakesScreenshot) driver;
	//File source = tk.getScreenshotAs(OutputType.FILE);
	//File dis = new File("C:\\Users\\V.Giri krishna\\eclipse-workspace\\Java\\ScreenShoot//" + pic + ".png");
	//FileUtils.copyFile(source, dis);
}



//public static void flueWait() {
	//FluenWait wait = new FluenWait(driver).withinTimout(30,TimeUnit.SECONDS);






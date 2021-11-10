package com.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Maven_project.Base_class;
import com.pom.Addcart;
import com.pom.Home_page;
import com.pom.Login;
import com.pom.Pom_class;
import com.pom.Process_to_check_out;
import com.pom.Sign;

public class Pom_project extends Base_class {
	public static WebDriver driver=Base_class.getbrowswer("chrome");
	public static Home_page hp = new Home_page(driver);
	public static Addcart cart = new Addcart(driver);
	public static Sign sign = new Sign(driver);
	public static Process_to_check_out check = new Process_to_check_out(driver);
	public static Login lg =new Login(driver);
	public static Pom_class pom = new Pom_class(driver);
	public static void main(String[] args) throws Throwable {
		geturl("http://automationpractice.com");
		impWait();
		actionClass("moveto", hp.getWomenclick());
		actionClass("click", hp.getTshirtclisk());
		actionClass("moveto",hp.getImgclick());
		actionClass("click", cart.getCartclick());
		clickonElement(check.getProcedureclick());
		clickonElement(sign.getProceclick());
	    inputsend(lg.getNameclick(), "girikrishna527@gmail.com");
		inputsend(lg.getPassclick(), "girikrishna");
		clickonElement(lg.getSi2());
		clickonElement(pom.getProceclick());
		clickonElement(pom.getProce2click());
		clickonElement(pom.getProce3click());
		clickonElement(pom.getSiclick());
	    clickonElement(pom.getEndclick());			
	}

}

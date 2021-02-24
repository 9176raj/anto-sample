package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Sample1{
	BaseClass base=new BaseClass();
	
	
	@Parameters({"username", "password", "Sydney"})
	@Test
	private void tc01(String s, String s1, String s3) {

		WebDriver driver = base.launchBrowser();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(s);
		driver.findElement(By.id("password")).sendKeys(s1);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("location"));
		
	}	
}


	

	
	
	
	


package org.tcs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Practice {
	@Parameters({"mobileNoInp"})
	@Test
	private void tc1(String s) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		

		WebElement element = driver.findElement(By.id("id=\"i-icon-profile\""));
		element.click();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		WebElement element2 = driver.findElement(By.id("signInLink"));
		element2.click();
		
		WebElement element3 = driver.findElement(By.id("mobileNoInp"));
		element3.sendKeys(s);
		
		
		
		
		
		
		
		
	}


	

}

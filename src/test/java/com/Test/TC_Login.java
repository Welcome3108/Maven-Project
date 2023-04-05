package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login {
	
	
	@Test
	public void login_Test() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin23");
		driver.findElement(By.id("btnLogin")).click();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
		driver.close();
		
		
		
		
		
		
		
		
	}
	
	
	
	

}

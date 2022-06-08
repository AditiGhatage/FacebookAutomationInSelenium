package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo 
{
	
	public WebDriver driver;

	public void intializationDriver() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
	driver.manage().window().maximize();
	
	}
	public void tearDown() {
	driver.quit();
	}
	
	public void getDetails()
	{
		//by Classname
		WebElement uPassword = driver.findElement(By.className("x25"));
		uPassword.sendKeys("234ghjuk");
		System.out.println("Passwprd is: " +uPassword);
		
		WebElement uEmail = driver.findElement(By.id("sView1:r1:0:email::content"));
		uEmail.sendKeys("aditi@gmai.com");
		System.out.println(" Email is: " +uEmail);
		
		WebElement uRepassword = driver.findElement(By.name("sView1:r1:0:retypePassword"));
		uRepassword.sendKeys("234ghjuk");
		System.out.println("Re-entered Password is: " +uRepassword);
		
		
		driver.findElement(By.xpath("//*[@id=\'sView1:r1:0:firstName::content\']"));
		
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content"));

		driver.findElement(By.linkText("Unsubscribe")).click();

		driver.findElement(By.partialLinkText("Oracle")).click();

		driver.findElement(By.tagName("img"));
		//list of al tags
		driver.findElement(By.tagName("img")).getSize();
		
		
	}

}

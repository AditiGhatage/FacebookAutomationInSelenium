package com.java.seleniumproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testfacebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Execution of the program starts...");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//String CurrentUrl = driver.getCurrentUrl();
		driver.quit();
		System.out.println("Execution completes....");
		

	}

}

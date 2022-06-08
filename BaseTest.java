package com.generic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.java.FacebookAutomation.Utility;

public class BaseTest extends Utility
{
	public WebDriver driver;

	public void intializationDriver(String strUrl) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	this.setDriver(driver);
	driver.get(strUrl);
	driver.manage().window().maximize();
	
	}
	public void tearDown() {
	driver.quit();
	}
	public WebDriver getDriver() {
	return driver;
	}
	public void setDriver(WebDriver driver) {
	this.driver = driver;
	}
	
	public void getTitle(String strValidTitle)
	{
		//String title = driver.getTitle(); 
		String parenttitle =driver.getWindowHandle();
		Set<String> setString =driver.getWindowHandles();
		Iterator<String> iteratorOne= setString.iterator();
		while(iteratorOne.hasNext())
		{

			String otherwindow=iteratorOne.next();

		if(!parenttitle.equals(otherwindow))
		{
			driver.switchTo().window(otherwindow);
			String strtitle = driver.switchTo().window(otherwindow).getTitle();
			System.out.println("Title of the page is : " + strtitle); 
			
			if(strtitle.equalsIgnoreCase(strValidTitle))
			{
				System.out.println("Title verified");
			}else
			{
				System.out.println("Title Differs..");
			}
		}
		
		}
		driver.close();
		driver.switchTo().window(parenttitle);	
	}
}


		
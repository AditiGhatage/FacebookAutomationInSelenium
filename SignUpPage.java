package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BaseTest
{
	public void setFirstNameOfSignUpPage() 
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(showFName());
	}

	public void setLastNameOfSignUpPage() 
	{
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(showLName());
	}
	
	public void getmobileNumber()
	{
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(getRandomMobile(8));
		
	}
	public void passWord() 
	{
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys(setPassword());
		waitFor(2);
	}
	
	public void getemail()
	{
		WebElement username =driver.findElement(By.xpath("//input[@name='reg_email__']"));
		username.sendKeys("abc@gmail.com");
		waitFor(2);
	}
	
	public void getRenterEmail() 
	{
		WebElement username =driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		username.sendKeys("abc@gmail.com");
		waitFor(2);
		
	}
	
	public void getGenderByClick()
	{
		Actions action = new Actions(driver);
		WebElement gender = driver.findElement(By.id("u_0_6_e9"));
		action.moveToElement(gender).click(); 
		gender.isSelected();	
	}
		
	public void gender()
	{			
			if(getRandomGender().equalsIgnoreCase("Female"))
			driver.findElement(By.xpath("//input[@value = '1']")).click();
			else if (getRandomGender().equalsIgnoreCase("Male"))
				driver.findElement(By.xpath("//input[@value = '2']")).click();
			else 
				driver.findElement(By.xpath("//input[@value = '-1']")).click();
			waitFor(2);
	}
	
	public void getDayOfDOB(String strDate) 
	{
		Select dateofDOB = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		dateofDOB.selectByVisibleText(getDate());
		System.out.println("Date is: "+strDate);
	}
		
	public void getMonthOfDOB(String strmonth) 
	{	
		Select monthofDOB = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		monthofDOB.selectByValue(getMonth());
		System.out.println("Month is: "+strmonth);
	}
		
	public void getYearOfDOB(String strYear) 
	{
		Select yearofDOB = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		yearofDOB.selectByValue(getRandomYear());
		System.out.println("Year is: "+strYear);
	}

	public void clickTermsLink() 
	{
		WebElement Terms = driver.findElement(By.xpath("//a[@id='terms-link']"));
		Terms.click();
		getTitle("Facebook");
		//waitFor(2);
	}
	
	public void clickDataPolicyLink() 
	{
		WebElement datapolicy = driver.findElement(By.xpath("//a[@id='privacy-link']"));
		datapolicy.click();		
		getTitle("Facebook");
		//waitFor(2);
	}
	
	public void clickCookiePolicyLink() 
	{
		WebElement cookiepolicy = driver.findElement(By.xpath("//a[@id='cookie-use-link']"));
		cookiepolicy.click();
		getTitle("Cookie Policy");
		//waitFor(2);
	}
	
	
		
}

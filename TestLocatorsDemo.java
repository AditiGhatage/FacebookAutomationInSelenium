package com.selenium.locators;

public class TestLocatorsDemo 
{

	public static void main(String[] args) throws Exception 
	{
		LocatorsDemo objlocator = new LocatorsDemo();
		objlocator.intializationDriver();
		objlocator.getDetails();
		
		objlocator.tearDown();

	}

}

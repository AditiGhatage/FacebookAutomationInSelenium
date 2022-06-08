package com.generic;

import com.java.FacebookAutomation.Utility;

public class TestFbPage extends BaseTest
{

	public static void main(String[] args) throws InterruptedException
	{

		SignUpPage objsignup =new SignUpPage();
		Utility objutility = new Utility();
		
		objsignup.intializationDriver("www.facebook.com");
		objsignup.setFirstNameOfSignUpPage();
		objsignup.setLastNameOfSignUpPage();
		objsignup.getmobileNumber();
		//objsignup.getemail();
		//objsignup.getRenterEmail();
		objsignup.passWord();
		objsignup.getDayOfDOB(objutility.getDate());
		objsignup.getMonthOfDOB(objutility.getMonth());
		objsignup.getYearOfDOB(objutility.getRandomYear());
		objsignup.gender();
		objsignup.waitFor(2);
		//objsignup.getGenderByClick();
		objsignup.clickTermsLink();
		objsignup.clickDataPolicyLink();
		objsignup.clickCookiePolicyLink();
		objsignup.waitFor(3);
		objsignup.tearDown();

	}

}

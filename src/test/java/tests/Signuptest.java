package tests;

import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.testng.listener.*;



import pages.HomePage;
import pages.MyAccountPage;
import pages.SignupPage;
import utilities.Screenshots;





//@Listeners({ExtentITestListenerClassAdapter.class})

public class Signuptest extends SignupPage {
	 
	HomePage homePage = new HomePage();
	MyAccountPage myAccountPage = new MyAccountPage();
	Screenshots screenshots = new Screenshots();
	
	
	
	@Test
	public void signup()
	{
			
				try {
					homePage.openAutomationPractice();
					homePage.clickSignin();
					typeEmail("user1@tmpeml.com");
					clickcreatAccount();
					clickfemalegender();
					typepassword("123");
					type1stname("Sara");
					typelastname("Adel");
					typecompany("SWH AutoTesting");
					typeaddress("Nasr_city");
					typeaddress2("nasr_city");
					typecity("cairo");
					typepostcode("123456");
					typehomephone("1230253");
					typemobile("0123456789");
					clickRegister();
					myAccountPage.assertMyAccountTitle();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			} 
			
	@AfterMethod
	public void tackeScreenShot()
	{ 
		screenshots.captureScreenShot("testScreenshot");
	}
}
	

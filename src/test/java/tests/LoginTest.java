package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginTest extends LoginPage {
	HomePage homePage = new HomePage();
	MyAccountPage myAccountPage = new MyAccountPage();
	@Test
	public void login() 
	{
		try {
			homePage.openAutomationPractice();
			homePage.clickSignin();
			typeEmailLog("user1@tmpeml.com");
			typepasswordLog("1234");
			clicksignin();
			myAccountPage.assertMyAccountTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

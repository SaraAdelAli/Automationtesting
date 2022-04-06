package pages;

import org.openqa.selenium.By;



import utilities.Assertion;
import utilitiesAction.ElementActions;

public class MyAccountPage extends ElementActions {
	Assertion assertions = new Assertion();
	
    By myAccountTitle = By.cssSelector(".page-heading");
   
    String myAccountTitleText = "MY ACCOUNT";
    
    public void assertMyAccountTitle()
    {
    	assertions.assertElementText(myAccountTitle, myAccountTitleText);
    }
}

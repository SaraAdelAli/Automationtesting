package pages;

import org.openqa.selenium.By;

import utilitiesAction.ElementActions;

public class LoginPage extends ElementActions {
		By emailLogin = By.id("email");
		By passwordLogin = By.id("passwd");
		By signin = By.xpath("//span[normalize-space()='Sign in']");
		
		
		
		public void typeEmailLog (String emailValue)
		{
		getElement (emailLogin).sendKeys(emailValue);
		}
		public void typepasswordLog (String pwValue)
		{
		getElement (passwordLogin).sendKeys(pwValue);
		}
		public void clicksignin ()
		{
		getElement (signin).click();
		}


}

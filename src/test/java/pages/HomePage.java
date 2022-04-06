package pages;

import org.openqa.selenium.By;

import utilities.ConfiUnit;
import utilitiesAction.ElementActions;


public class HomePage extends ElementActions {
		
	By sign_in = By.xpath("//a[normalize-space()='Sign in']");
	public void openAutomationPractice() 
	{
		System.out.println(ConfiUnit.Web_URL);
		driver.navigate().to(ConfiUnit.Web_URL);

	}
		
	
			
		

	
	public void clickSignin()
	{
		getElement(sign_in).click();
	}

}

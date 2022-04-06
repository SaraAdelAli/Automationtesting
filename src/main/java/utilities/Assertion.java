package utilities;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import utilitiesAction.ElementActions;

public class Assertion extends ElementActions{
	public void assertElementExist(By locator) 
	{
		assert getElement(locator).isDisplayed();
	}
public void assertElementEnabled(By locator) 
	{
		assertTrue(getElement(locator).isEnabled());
	}
public void assertElementDisabled(By locator)
	{
		assertFalse(getElement(locator).isEnabled());
	}
public void assertButtonEnabled(By locator, String disabledClassName)
{
    String classes = getElement(locator).getAttribute("class");
    boolean isDisabled = classes.contains(disabledClassName);
    assertTrue((!isDisabled));
}
public void assertElementText(By locator, String text) 
{
    String elementText = "";
    elementText = getElement(locator).getText();
    assertEquals(elementText, text);
    
}


}








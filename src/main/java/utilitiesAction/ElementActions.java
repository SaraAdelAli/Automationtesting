package utilitiesAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.TestBase;




public class ElementActions extends TestBase{
	

	public WebElement getElement(By locator) {
		//WebElement element =null;
					
				
					WebElement element = driver.findElement(locator);
					scrollPageToElement(element);
					return element;
				
	}
	
		
	
	public void scrollPageToElement(WebElement element) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            actions.moveToElement(element).build().perform();
            highlightElement(element);
            unhighlightElement(element);
        	} catch (Exception ignored) {
        		//e.printStackTrace();
        }
    }
	 public void highlightElement(WebElement element) {
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].setAttribute('style', 'background: #ffffe6; border: 2px solid yellow;');", element);
	    }
	 public void unhighlightElement(WebElement element) {
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].removeAttribute('style','')", element);
	 }
	 
	 public WebElement getElementByIndex(By locator, int index) {
	        WebElement element = driver.findElements(locator).get(index);
	        scrollPageToElement(element);
	        return element;
	    }
	 
}
	
	

	        
	
	
	


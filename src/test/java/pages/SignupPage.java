package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;

import utilitiesAction.ElementActions;


//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;




public class SignupPage extends ElementActions {	
	
	
By email = By.id("email_create");
By createAccount = By.xpath("//span[normalize-space()='Create an account']");
By malegender = By.id("id_gender1");
By femalegender = By.id("id_gender2");
By firstname = By.id("firstname");
By lastname = By.id("lastname");
By password = By.id("passwd");
By birthday = By.id("days");
By birthmonth = By.id("months");
By birthyear = By.id("years");
By company = By.id("company");
By address = By.id("address1");
By address2 = By.id("address2");
By city = By.id("city");
By state = By.id("id_state");
By postcode = By.id("postcode");
By country = By.id("id_country");
By homephone = By.id("phone");
By mobile = By.id("phone_mobile");
By register = By.xpath("//span[normalize-space()='Register']");
/*********************************************************************/



/************************************************************************/
 


public void typeEmail (String emailValue)
	{
	getElement (email).sendKeys(emailValue);
	}


public void typepassword (String pwValue)
	{
	getElement (password).sendKeys(pwValue)	;
	}


public void type1stname (String firstnameValue)
	{
	getElement (firstname).sendKeys(firstnameValue);
	}


public void typelastname (String lastnameValue)
	{
	getElement (lastname).sendKeys(lastnameValue);	
	}


public void typecompany (String companyValue)
	{
	getElement (company).sendKeys(companyValue);
	}


public void typeaddress (String addressValue)
	{
	getElement (address).sendKeys(addressValue);
	}


public void typeaddress2 (String address2Value)
	{
	getElement (address2).sendKeys(address2Value);
	}


public void typecity (String cityValue)
	{
	getElement (city).sendKeys(cityValue);
	}


public void typepostcode (String postcodeValue)
	{
	getElement (postcode).sendKeys(postcodeValue);
	}


public void typehomephone (String homephoneValue)
	{
	getElement (homephone).sendKeys(homephoneValue);
	}


public void typemobile (String mobileValue)
	{
	getElement (mobile).sendKeys(mobileValue);
	}


public void clickcreatAccount ()
	{
	getElement (createAccount).click();
	}


public void clickRegister ()
	{
	getElement (register).click();
	}


public void clickmalegender ()
	{
	getElement (malegender).click();
	}


public void clickfemalegender ()
	{
	getElement (femalegender).click();
	}

}



package pagepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Resgistrationpage  {
	
@FindBy(xpath="//*[@class='ico-register']")
WebElement registerButton;


@FindBy(xpath="//*[@id=\"gender-female\"]")
WebElement radio;

@FindBy(xpath="//*[@id=\"FirstName\"]")
WebElement firstname;
@FindBy(xpath="//*[@id=\"LastName\"]")
WebElement lastname;
@FindBy(xpath="//*[@id=\"Email\"]")
WebElement email;

@FindBy(xpath="//*[@id=\"Password\"]")
WebElement password;
@FindBy(xpath="//*[@id=\"ConfirmPassword\"]")
WebElement confpasswrd;

@FindBy(xpath="//*[@id=\"register-button\"]")
WebElement confirmRegister;


public Resgistrationpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void Registeruser(String first, String last, String mail) {
	registerButton.click();
	radio.click();
	firstname.sendKeys(first);
	lastname.sendKeys(last);
	email.sendKeys(mail);

}

public void UserPassword(String pass , String confpswd)
	{
		password.sendKeys(pass);
		confpasswrd.sendKeys(confpswd);
		
	}
	
	public void register()
	{
		confirmRegister.click();
	
}
}


	


	
		
	


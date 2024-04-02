package pagepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Loginpage  {

	public Loginpage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='ico-login']")
	WebElement loginButton;
	@FindBy(xpath="//*[@id='Email']")
	WebElement Email;
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement pass;
	@FindBy(xpath="//*[@class=\"inputs reversed\"]")
	WebElement Login;


public void logindetails(String username,String password)
{
	loginButton.click();
	Email.sendKeys(username);
	pass.sendKeys(password);
	
}
public void login()
{
	Login.click();
}
}
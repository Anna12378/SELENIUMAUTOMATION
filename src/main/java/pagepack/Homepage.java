package pagepack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepage {
	public Homepage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
@FindBy(tagName="a")
List<WebElement> links;



@FindBy(xpath="//*[@class='top-menu']/li")
List<WebElement> mainelements;

public int Linkcount()
{
	int totallinks=links.size();
     
	return totallinks;
}
public int displaysLinks()
{
	int count=0;
	for(WebElement Link:links)
	{
		if(Link.isDisplayed()) {
			count++;
		}
	}
	return count;
		
}
     public void verifylinks() {
     
      
     for(WebElement elements:links)
       {
	System.out.println(elements.getText());
     }
   }
     public int elementscount()
     {
    	 int size=mainelements.size();
    	 return size;
     }
     public void validatetexts()
     {
    	 for(WebElement element:mainelements)
    	 {
    		 System.out.println(element.getText());
    	 }
     }
}

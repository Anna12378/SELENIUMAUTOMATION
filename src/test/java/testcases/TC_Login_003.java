package testcases;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepack.Loginpage;

public class TC_Login_003 extends Baseclass {
	@Test
	public void test1()
	{
		
			TC_linkTest_001 tc1=new TC_linkTest_001();
			tc1.linkTest();
		}
@Test
public void test2()
{
	Loginpage lp=new Loginpage(driver);
	lp.logindetails("annayit12@gmail.com", "Test@1234");
	}
	
	
}



package testcases;


import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepack.Resgistrationpage;

public class TC_Registepage_002  extends Baseclass{
	@Test(priority = 1)
	public void test1()
	{
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	}

	@Test(priority = 2)
public  void test2()
{
	Resgistrationpage rp=new Resgistrationpage(driver);
	rp.Registeruser("Anna","sara","annayit123@gmail.com");
	rp.UserPassword("Test@1234", "Test@1234");
    rp.register();
	
}
	
}

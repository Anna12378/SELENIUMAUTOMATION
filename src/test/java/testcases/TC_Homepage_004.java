package testcases;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepack.Homepage;




public class TC_Homepage_004 extends Baseclass {
	
	@Test
	public void test1() throws InterruptedException
	
	{
		Thread.sleep(2000);
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	}
	@Test


	public void test3()
	{
		Homepage hp=new Homepage(driver);
		int display=hp.displaysLinks();
		System.out.println("the display lint count is=" +display);
	}
}




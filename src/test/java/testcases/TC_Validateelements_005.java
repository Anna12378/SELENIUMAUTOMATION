package testcases;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepack.Homepage;

public class TC_Validateelements_005 extends Baseclass{
	@Test
	public void test1()
	{
		
			TC_linkTest_001 tc1=new TC_linkTest_001();
			tc1.linkTest();
		}
	@Test
	public void test2()
	{
		Homepage hp=new Homepage(driver);
		hp.validatetexts();
	}
	}



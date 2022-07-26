package Testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	 LoginPage login;
	 
	   @BeforeMethod
	   
	   public void setup() throws IOException 
	   {
		   initilization();
		   
		   login = new LoginPage();
	   }
	   
	   
	   @Test (enabled=false)
	   
	   public void verifykiteLogoTest()
	   {
		 boolean value = login.verifykiteLogo();
		 Assert.assertEquals(value, true);
	   }
	   
	   @Test  (enabled=false)
	   public void verifyzerodhaLogoTest()
	   {
		   boolean value = login.verifyzerodhaLogo();
		   Assert.assertEquals(value, true);
	   }
	   
	   @Test  (enabled=false)
	   
	   public void verifyTitleTest()
	   {
		  String title = login.verifyTitle();
		  Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", title);
	   }
	   
	   @Test
	   public void verifyLoginToAppTest() throws InterruptedException, IOException
	   {
		   String nicknamelabel = login.verifyLoginToApp();
		   
		   Assert.assertEquals(nicknamelabel, "Suhas");
		   
	   }
	   
	   @AfterMethod
	   
	   public void exit()
	   {
		   driver.close();
	   }

}

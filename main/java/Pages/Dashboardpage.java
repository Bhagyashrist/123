package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Dashboardpage extends TestBase{
	
	@FindBy(xpath="//div[@class='avatar']")private WebElement avatarIcon; 
	@FindBy(xpath="//h4[@class='username']")private WebElement username;
	@FindBy(xpath="//div[@class='email']")private WebElement emailid;
	
	//@FindBy(xpath="")private WebElement 
	//@FindBy(xpath="")private WebElement 
	//@FindBy(xpath="")private WebElement 
	//@FindBy(xpath="")private WebElement 
//	@FindBy(xpath="")private WebElement 
	
	public Dashboardpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyusername() throws InterruptedException
	{
		avatarIcon.click();
		Thread.sleep(2000);
		username.getText();
	}
	
	public void verifyemailid() throws InterruptedException
	{
		avatarIcon.click();
		Thread.sleep(2000);
		emailid.getText();
		
		
	}

}

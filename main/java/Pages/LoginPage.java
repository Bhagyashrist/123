package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//img[@alt='Kite']")private WebElement kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']")private WebElement zerodhaLogo;
	
	@FindBy(xpath="//input[@type='text']")private WebElement usernametxtbox;
	@FindBy(xpath="//input[@type='password']")private WebElement passwordtxtbox;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbtn;
	@FindBy(xpath="//input[@id='pin']")private WebElement pintxtbox;
	@FindBy(xpath="//button[text()='Continue ']")private WebElement continuebtn;
	@FindBy(xpath="//span[@class='nickname']")private WebElement nicknamelabel;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifykiteLogo()
	{
		return kiteLogo.isDisplayed();
	}
	
	public boolean verifyzerodhaLogo()
	{
		return zerodhaLogo.isDisplayed();
	}
	
	public String verifyLoginToApp() throws InterruptedException, IOException
	{
		usernametxtbox.sendKeys(readPropertyFile("username"));
		Thread.sleep(3000);
		passwordtxtbox.sendKeys(readPropertyFile("password"));
		Thread.sleep(3000);
		loginbtn.click();
		Thread.sleep(3000);
		pintxtbox.sendKeys(readPropertyFile("pin"));
		Thread.sleep(3000);
		continuebtn.click();
		Thread.sleep(3000);
		return nicknamelabel.getText();
	}
	
}

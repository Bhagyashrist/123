package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

     public static WebDriver driver;
     
     public String readPropertyFile(String value) throws IOException
     {
    	 Properties prop = new Properties();
    	 FileInputStream file = new FileInputStream("C:\\Users\\Devansh\\eclipse-workspace11\\Demo3\\src\\main\\java\\Config\\Config.properties");
    	 prop.load(file);
    	 
    	return prop.getProperty(value);
     }
	
	public void initilization() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://kite.zerodha.com/");
		driver.get(readPropertyFile("url"));
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
	}
}

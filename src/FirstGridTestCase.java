import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FirstGridTestCase {
	WebDriver driver;
	
	String baseUrl,nodeUrl; 
	
	@BeforeTest  
	public void setUp() throws MalformedURLException
	{
		baseUrl = "http:/newtours.demoaut.com/"; 
		nodeUrl = "http://localhost:4445/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.VISTA);
		driver = new RemoteWebDriver(new URL(nodeUrl),capability);
		
		/*System.setProperty("webdriver.chrome.driver", "D:/Selenium/selenium-java-2.46.0/selenium-2.46.0/chromedriver_win32/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "D:/Selenium/selenium-java-2.46.0/selenium-2.46.0/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		DesiredCapabilities capability1 = DesiredCapabilities.chrome();
		capability1.setBrowserName("chrome");
		capability1.setPlatform(Platform.VISTA);
		driver = new RemoteWebDriver(new URL(nodeUrl),capability1);*/
	} 
@Test   
public void simpleTest() 
{
	driver.get(baseUrl);
Assert.assertEquals("Welcome: Mercury Tours",driver.getTitle());
}
}

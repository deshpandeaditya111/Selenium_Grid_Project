package testNG.Parallel;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class Test01 extends TestBase{
	WebDriver driver;
    @Test
    public void testLink()throws Exception{
    	
    	getDriver().get("http:/newtours.demoaut.com/");
    	//driver.get("http:/newtours.demoaut.com/");
    	Assert.assertEquals("Welcome: Mercury Tours",getDriver().getTitle());
    	System.out.println(getDriver().getTitle());
      
    }
} 
import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;    
import org.openqa.selenium.firefox.FirefoxDriver;    
import org.openqa.selenium.remote.DesiredCapabilities; 

public class Navigation_command {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\GeckoDriver\\geckodriver.exe" );    
        
        // Initialize Gecko Driver using Desired Capabilities Class    
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();    
            capabilities.setCapability("marionette",true);    
            WebDriver driver= new FirefoxDriver(capabilities);    
            
            driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
            
            driver.findElement(By.linkText("This is a link")).click();
            
            driver.navigate().back();
            
            driver.navigate().forward();
            
            driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
            
            driver.navigate().refresh();
            
            driver.close();
            
            
	
	
	
	}

}

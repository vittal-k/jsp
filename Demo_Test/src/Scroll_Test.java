import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.remote.DesiredCapabilities;  
  
public class Scroll_Test {  
  
    public static void main(String[] args) {  
          
        // System Property for Gecko Driver   
        System.setProperty("webdriver.gecko.driver","D:\\GeckoDriver\\geckodriver.exe" );  
              
        // Initialize Gecko Driver using Desired Capabilities Class  
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
            capabilities.setCapability("marionette",true);  
            WebDriver driver= new FirefoxDriver(capabilities);  
          
  
        // Launch Website  
        driver.navigate().to("javatpoint.com");   
  
        //Scroll down the webpage by 4500 pixels  
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.equals("scrollBy(0,4500)");
        
        
    }
}

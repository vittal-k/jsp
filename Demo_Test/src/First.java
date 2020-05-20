import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.remote.DesiredCapabilities;  
import org.openqa.selenium.support.ui.Select;  
  
public class First {  
  
    /**
     * @param args
     */
    public static void main(String[] args) {  
          
          // System Property for Gecko Driver   
    System.setProperty("webdriver.gecko.driver","D:\\GeckoDriver\\geckodriver.exe" );  
          
         // Initialize Gecko Driver using Desired Capabilities Class  
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
        capabilities.setCapability("marionette",true);  
        WebDriver driver = new FirefoxDriver(capabilities);
        
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
        
        //driver.findElement(By.linkText("This is a link")).click();
        
        driver.findElement(By.id("fname")).sendKeys("JavaTpoint");
        
        driver.findElement(By.id("fname")).clear();
        
        //driver.findElement(By.id("idOfButton")).click();
        
        driver.findElement(By.id("male")).click();
        
        driver.findElement(By.cssSelector("input.automation")).click();
        
        Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
        dropdown.selectByVisibleText("Automation Testing");  
        
        driver.close();
        
      
    }  
  
}  
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 

public class Third {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.javatpoint.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Java" )).click();
	}

}

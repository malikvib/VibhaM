package vibhaPlanitTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;  


public class BaseTest {
	

    
	public WebDriver driver;
	//WebDriverSetUpAndTearDown WST = new WebDriverSetUpAndTearDown();   // Constructor
    //driver = WST.openDriverAndLaunchApplication("https://jupiter.cloud.planittesting.com/");  
	//driver = openDriverAndLaunchApplication("https://jupiter.cloud.planittesting.com/");
	
	
    public WebDriver openDriverAndLaunchApplication(){		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\Downloads\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://jupiter.cloud.planittesting.com/");
		 return driver;
		 
	 }
	
	public void waitMethod(long secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
	}
	
    public void closeDriver(){
		 
		 driver.close();
		
	 }
    
}

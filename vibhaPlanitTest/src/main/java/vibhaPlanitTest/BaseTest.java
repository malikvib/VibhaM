package vibhaPlanitTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;

	public WebDriver openDriverAndLaunchApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jupiter.cloud.planittesting.com/");
		driver.manage().window().maximize();
		return driver;

	}

	public WebDriverWait waitMethod(long secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait;
	}

	public void closeDriver() {

		driver.close();

	}

}

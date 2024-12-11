package vibhaPlanitTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectIdentificationMethod {

	public WebElement ElementGetMethod(WebDriver driver, String elementName, String identifierType) {

		switch (identifierType) {

		case "id":
			return driver.findElement(By.id(elementName));

		case "name":
			return driver.findElement(By.name(elementName));

		case "css":
			return driver.findElement(By.cssSelector(elementName));

		default:
			return null;

		}
	}
}

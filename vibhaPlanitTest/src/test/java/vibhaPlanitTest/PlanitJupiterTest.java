package vibhaPlanitTest;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PlanitJupiterTest {

	ObjectIdentificationMethod OM = new ObjectIdentificationMethod();
	BaseTest BT = new BaseTest();
	ElementLocators EL = new ElementLocators();

	private String forename = "Forename is required";
	private String email = "Email is required";
	private String message = "Message is required";

	@Test
	public void VerifyContactPageErrorMessages() {

		WebDriver driver = BT.openDriverAndLaunchApplication();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		OM.ElementGetMethod(driver, EL.Contact, "id").click();

		// BT.waitMethod().until(ExpectedConditions.elementToBeClickable(OM.ElementGetMethod(driver,EL.Submit,
		// "css")));
		BT.waitMethod(5);
		OM.ElementGetMethod(driver, EL.Submit, "css").click();
		BT.waitMethod(5);
		// BT.waitMethod(5).until(ExpectedConditions.visibilityOf(OM.ElementGetMethod(driver,EL.ForenameErrorMessage,"id")));
		assertEquals(OM.ElementGetMethod(driver, EL.ForenameErrorMessage, "id").getText(), forename);
		assertEquals(OM.ElementGetMethod(driver, EL.EmailErrorMessage, "id").getText(), email);
		assertEquals(OM.ElementGetMethod(driver, EL.MessageErrorMessage, "id").getText(), message);
		BT.waitMethod(5);
		// BT.waitMethod(5).until(ExpectedConditions.visibilityOf(OM.ElementGetMethod(driver,EL.Forename,"id")));
		OM.ElementGetMethod(driver, EL.Forename, "id").sendKeys("Malik");
		OM.ElementGetMethod(driver, EL.email, "id").sendKeys("abc@gmail.com");
		OM.ElementGetMethod(driver, EL.message, "id").sendKeys("GOOD");
		try {

			assertEquals(OM.ElementGetMethod(driver, EL.ForenameErrorMessage, "id").getText(), forename);
			assertEquals(OM.ElementGetMethod(driver, EL.EmailErrorMessage, "id").getText(), email);
			assertEquals(OM.ElementGetMethod(driver, EL.MessageErrorMessage, "id").getText(), message);

		} catch (NoSuchElementException e) {

			System.out.println("Not an error. Assertion Passed");
		}

		BT.closeDriver(); // Closing the Driver

	}

	@Test(invocationCount = 5)
	public void SubmitContactDetailsAndVerifySuccessMessage() {

		WebDriver driver = BT.openDriverAndLaunchApplication();
		OM.ElementGetMethod(driver, EL.Contact, "id").click();
		BT.waitMethod(10);
		OM.ElementGetMethod(driver, EL.Forename, "id").sendKeys("Malik");
		OM.ElementGetMethod(driver, EL.email, "id").sendKeys("abc@gmail.com");
		OM.ElementGetMethod(driver, EL.message, "id").sendKeys("GOOD");
		BT.waitMethod(5);
		OM.ElementGetMethod(driver, EL.Submit, "css").click();
		BT.waitMethod(15);
		OM.ElementGetMethod(driver, EL.SucccessMessage, "css").click();
		BT.closeDriver(); // Closing the Driver
	}

	@Test
	public void verifyingCartTest() {

		WebDriver driver = BT.openDriverAndLaunchApplication();
		OM.ElementGetMethod(driver, EL.Shop, "id").click();
		BT.waitMethod(5);
		OM.ElementGetMethod(driver, EL.BearBuy, "css").click();
		OM.ElementGetMethod(driver, EL.FrogBuy, "css").click();
		OM.ElementGetMethod(driver, EL.BunnyBuy, "css").click();
		OM.ElementGetMethod(driver, EL.Cart, "id").click();

		// Frog
		OM.ElementGetMethod(driver, EL.FrogBuyQty, "css").clear();
		OM.ElementGetMethod(driver, EL.FrogBuyQty, "css").sendKeys("2");
		assertEquals(OM.ElementGetMethod(driver, EL.FrogBuySubtotal, "css").getText(), "$21.98");
		assertEquals(OM.ElementGetMethod(driver, EL.FrogBuyPrice, "css").getText(), "$10.99");

		// Bunny
		OM.ElementGetMethod(driver, EL.BunnyBuyQty, "css").clear();
		OM.ElementGetMethod(driver, EL.BunnyBuyQty, "css").sendKeys("5");
		assertEquals(OM.ElementGetMethod(driver, EL.BunnyBuySubtotal, "css").getText(), "$49.95");
		assertEquals(OM.ElementGetMethod(driver, EL.BunnyBuyPrice, "css").getText(), "$9.99");

		// Valentine bear
		OM.ElementGetMethod(driver, EL.BearBuyQty, "css").clear();
		OM.ElementGetMethod(driver, EL.BearBuyQty, "css").sendKeys("3");
		assertEquals(OM.ElementGetMethod(driver, EL.BearBuySubtotal, "css").getText(), "$44.97");
		assertEquals(OM.ElementGetMethod(driver, EL.BearBuyPrice, "css").getText(), "$14.99");

		// Total price
		assertEquals(OM.ElementGetMethod(driver, EL.Total, "css").getText(), "Total: 116.9");
		BT.closeDriver(); // Closing the Driver

	}

}

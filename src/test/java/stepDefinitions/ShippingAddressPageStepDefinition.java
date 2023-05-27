package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import pageObjects.ShippingAddressPage;
import utils.TestContextSetup;

public class ShippingAddressPageStepDefinition {

	public WebDriver driver;
	public ShippingAddressPage shippingaddresspage;
	TestContextSetup testcontextsetup;
	PageObjectManager pageObjectmanager;

	public ShippingAddressPageStepDefinition(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		shippingaddresspage = testcontextsetup.pageObjectmanager.getshippingaddresspage();
	}
	
	@Given("user enter random {int} char into shipping address {string}")
	public void user_enter_random_char_into_shipping_address(int num, String path)   {
		String value=testcontextsetup.genericUtils.randomString(num);
		shippingaddresspage.ShippingtextBox(path).clear();		
		shippingaddresspage.ShippingtextBox(path).sendKeys(value);
	}
	@Then("user enter random {int} char into shipping mail")
	public void user_enter_random_char_into_shipping_mail(int num) throws InterruptedException {
		String value=testcontextsetup.genericUtils.randomString(num);		
		shippingaddresspage.ShippingEmail().sendKeys(value+"@gmail.com");
	}
	@Given("user enter random {int} number into shipping address {string}")
	public void user_enter_random_number_into_shipping_address(int num, String path)   {
		String value=testcontextsetup.genericUtils.randomNumber(num);
		shippingaddresspage.ShippingtextBox(path).clear();		
		shippingaddresspage.ShippingtextBox(path).sendKeys(value);
	}
 
}

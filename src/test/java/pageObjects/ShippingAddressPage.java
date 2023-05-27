package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingAddressPage {
	public WebDriver driver;

	public ShippingAddressPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement ShippingtextBox(String inputText) {
		return driver.findElement(By.xpath("(//*[text()='"+inputText+"']//following::input)[1]"));
		//(//*[text()='"+inputText+"']//following::div/input)[1]
	}
	
}
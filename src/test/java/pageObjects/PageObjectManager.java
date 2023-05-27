package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LandingPage landingPage;
	public OfferPage offerPage;
	public ShippingAddressPage shippingaddresspage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;

	}

	public LandingPage getlandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}

	public OfferPage getofferPage() {
		offerPage = new OfferPage(driver);
		return offerPage;
	}
	public ShippingAddressPage getshippingaddresspage() {
		shippingaddresspage = new ShippingAddressPage(driver);
		return shippingaddresspage;
	}
}

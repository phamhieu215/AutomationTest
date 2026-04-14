package AutomationTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import AutomationTest.pageobjects.CartPage;
import AutomationTest.pageobjects.CheckoutPage;
import AutomationTest.pageobjects.ConfirmationPage;
import AutomationTest.pageobjects.LandingPage;
import AutomationTest.pageobjects.ProductCatalogue;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitOrderTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String productName ="ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo(); 
		ProductCatalogue productCatalogue = landingPage.loginApplication("hieupham@gmail.com","Phamhieu@215");
		
		List<WebElement>products = productCatalogue.getProductsList();
		
		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();
		
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		
		
		
		CheckoutPage checkoutPage= cartPage.goToCheckout();
		checkoutPage.selectCountry("India");
		 ConfirmationPage  confirmationPage = checkoutPage.submitOrder();
		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		
	}

}

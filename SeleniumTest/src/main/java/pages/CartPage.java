package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;
	
	By cartIcon = By.id("shopping_cart_container");
	By checkoutButton = By.id("checkout");
	By continueShoppingButton = By.id("continue-shopping");
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCartIcon() {
		driver.findElement(cartIcon).click();   // To open the cart 
	}
	
	
	public void clickCheckoutButton() {
		driver.findElement(checkoutButton).click(); // checkout
	}
	
	public int getCartItemCount() {
		String itemCountText = driver.findElement(cartIcon).getText();
		return Integer.parseInt(itemCountText);
	}
}



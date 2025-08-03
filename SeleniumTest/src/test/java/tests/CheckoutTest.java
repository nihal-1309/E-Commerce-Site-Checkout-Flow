package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

import java.util.List;

public class CheckoutTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void CheapestAndCostliestItem() {
        driver.get("https://www.saucedemo.com/");
        
        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Step 2: Sort by "Price (low to high)"
        WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
        sortDropdown.click();
        sortDropdown.findElement(By.cssSelector("option[value='lohi']")).click();

        // Step 3: Add cheapest and most expensive products
        List<WebElement> addToCartButtons = driver.findElements(By.cssSelector(".inventory_item .btn_inventory"));
        if (addToCartButtons.size() >= 2) {
            addToCartButtons.get(0).click(); // Cheapest
            addToCartButtons.get(addToCartButtons.size() - 1).click(); // Most expensive
        } else {
            Assert.fail("Less than 2 products found on the page.");
        }

        // Step 4: Assert that cart icon shows 2 items
        WebElement cartBadge = driver.findElement(By.className("shopping_cart_link"));
        String itemCount = cartBadge.getText();
        Assert.assertEquals(itemCount, "2", "Cart should show 2 items.");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


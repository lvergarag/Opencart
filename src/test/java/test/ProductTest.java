package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.HomePage;
import page.ProductPage;

public class ProductTest {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");
    }

    @Test
    public void validarMacBookProductCode() {
        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);

        home.clickMacBook();
        String actual = product.getProductCode();

        Assert.assertEquals(actual, "Product Code: Product 16");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

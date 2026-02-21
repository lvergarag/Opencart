
/*package page;*/
package com.example.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import page.HomePage;
import page.ProductPage;

/*
import com.example.pages.HomePage;
import com.example.pages.ProductPage;
*/

public class OpenCartSteps {

    private WebDriver driver;
    private HomePage home;
    private ProductPage product;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        home = new HomePage(driver);
        product = new ProductPage(driver);
    }

    @Given("User navigates to OpenCart homepage")
    public void open_home()  throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("Given - User clicks on Product");
        home.open();
    }

    @When("User clicks on MacBook product")
    public void click_mac() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("When - User clicks on MacBook product");
        home.clickMacBook();
    }

    @When("User clicks on iPhone product")
    public void click_iPhone() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("When - User clicks on iPhone product");
        home.clickiPhone();;
    }

    @Then("Product code text should be {string}")
    public void validate_code(String expectedCode)  {
        ProductPage productPage = new ProductPage(driver);
        System.out.println("Assert - User clicks on Producto");
        String actualCode = productPage.getProductCodeText();
        Assert.assertEquals(expectedCode, actualCode);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("After  - User clicks on Product");
        System.out.println(" ");
        System.out.println("After  - Proceso finalizo OK");
        if (driver != null) driver.quit();
    }
}


package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private By macbookLink = By.linkText("MacBook");
    private By iPhoneLink = By.linkText("iPhone");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("http://opencart.abstracta.us/");
    }

    public void clickMacBook() {
        wait.until(ExpectedConditions.elementToBeClickable(macbookLink)).click();
    }

    public void clickiPhone() {
            wait.until(ExpectedConditions.elementToBeClickable(iPhoneLink)).click();
    }
}

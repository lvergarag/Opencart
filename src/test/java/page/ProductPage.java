
package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {

    private By productCode = By.xpath("//li[contains(text(), 'Product Code') or contains(text(), 'Producto')]");
  /*  private By productCode = By.xpath("//*[contains(text(),'Código de producto')]"); */

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductCode() {
        return driver.findElement(productCode).getText().trim();
    }


    public String getProductCodeText() {
        // Agregamos una espera explícita para que no falle por velocidad
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productCode)).getText();
    }

    /*
    public String getProductCodeText() {
        return driver.findElement(productCode).getText();
    }
    public String getProductCodeText() {
        // Aquí debe ir el código para obtener el texto del elemento
        // Ejemplo: return driver.findElement(By.id("codigo")).getText();
        return someWebElement.getText();
    }
    */


}

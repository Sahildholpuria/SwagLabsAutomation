import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class commerce {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.saucedemo.com/");

        Thread.sleep(1000);

        chromeDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        chromeDriver.findElement(By.id("password")).sendKeys("secret_sauce");

        chromeDriver.findElement(By.id("login-button")).click();

        chromeDriver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        chromeDriver.findElement(By.id("react-burger-cross-btn")).click();

        chromeDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        chromeDriver.findElement(By.className("shopping_cart_link")).click();


        //Checkout
        chromeDriver.findElement(By.id("checkout")).click();

        chromeDriver.findElement(By.id("first-name")).sendKeys("Sahil Dholpuria");
        chromeDriver.findElement(By.id("last-name")).sendKeys("Dholpuria");
        chromeDriver.findElement(By.id("postal-code")).sendKeys("302022");
        chromeDriver.findElement(By.id("continue")).click();
        chromeDriver.findElement(By.id("finish")).click();

    }
}

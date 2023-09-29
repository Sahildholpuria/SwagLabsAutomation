import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class SwagLabsAutomation {
    public static void main(String[] args) throws IOException, InterruptedException {

        ChromeDriver chromeDriver = new ChromeDriver();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\sahil\\IdeaProjects\\Java\\src\\test\\java\\credentials.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
//        System.out.println(sheet.getRow(0).getCell(0));

        String username = String.valueOf(sheet.getRow(0).getCell(0));
        String password = String.valueOf(sheet.getRow(0).getCell(1));

        chromeDriver.get("https://www.saucedemo.com/");

        Thread.sleep(1000);

        chromeDriver.findElement(By.id("user-name")).sendKeys(username);
        chromeDriver.findElement(By.id("password")).sendKeys(password);

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

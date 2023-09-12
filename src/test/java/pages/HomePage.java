package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Utils;

public class HomePage extends Utils {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessWebsite() throws InterruptedException {

        driver.get("https://buger-eats.vercel.app/");
        waitElementBePresent(By.id("page-home"), 10);
    }

    public void clickRegister() throws InterruptedException {
        driver.findElement(By.cssSelector("#page-home > div > main > a > strong")).click();

    }

    public void fillFieldsOfRegister() throws InterruptedException {
        driver.findElement(By.name("name")).sendKeys("Alisson Dal Bosco");
        driver.findElement(By.name("cpf")).sendKeys("45484667038");
        driver.findElement(By.name("email")).sendKeys("alisson.testbugereats@gmail.com");
        driver.findElement(By.name("whatsapp")).sendKeys("46999999999");
        driver.findElement(By.cssSelector("#page-deliver > form > fieldset:nth-child(3) > div:nth-child(2) > div:nth-child(1) > input[type=text]")).sendKeys("85501530");
        driver.findElement(By.cssSelector("#page-deliver > form > fieldset:nth-child(3) > div:nth-child(2) > div:nth-child(2) > input[type=button]")).click();
        driver.findElement(By.name("address-number")).sendKeys("2000");
        driver.findElement(By.name("address-details")).sendKeys("AP 09");
        scrollDown();
        driver.findElement(By.xpath("//*[@id=\"page-deliver\"]/form/fieldset[3]/ul/li[1]/img")).click();
        updloadFile();

    }

    public void clickRegisterFinal() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#page-deliver > form > button")));
        driver.findElement(By.cssSelector("#page-deliver > form > button")).click();

    }
}

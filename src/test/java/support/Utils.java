package support;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.io.File;

public class Utils extends RunCucumberTest {

    public void waitElementBePresent(By element, int tempo) {

        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void scrollDown() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }

    public void updloadFile() {
        try {
            WebElement inputFile = driver.findElement(By.xpath("//*[@id=\"page-deliver\"]/form/div/input"));

            String caminhoArquivo = "D:\\Automação\\Selenium\\QazandoSeleniumTestsBugerEats\\cnh-digital.png";

            inputFile.sendKeys(caminhoArquivo);

            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-deliver\"]/form/div/input")));


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}

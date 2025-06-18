package ex05_seleniumwaits;

import utilities.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium24_MiniProject4 extends CommonToAll {

    public static void main(String[] args){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://makemytrip.com/");

        //*[@id="SW"]/div[1]/div[2]/div[2]/div/section/span

        waitForVisibility(driver,3,"//span[@data-cy='closeModal']");

        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModel.click();

        driver.close();
    }
}

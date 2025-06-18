package ex05_seleniumwaits;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium23_Fix_Miniproject {

    @Test
    @Description("Fixing the test using explicit waits")
    public void testVwoLoginNegative() {

        public void testVwoLoginNegative () {
            ChromeOptions edgeOptions = new ChromeOptions();
            edgeOptions.addArguments("--incognito");
            edgeOptions.addArguments("--start-maximized");

            WebDriver driver = new ChromeDriver(edgeOptions);


            driver.navigate().to("https://app.vwo.com");
            System.out.println(driver.getTitle());


            WebElement emailInputBox = driver.findElement(By.id("login-username"));
            emailInputBox.sendKeys("admin@admin.com");

            WebElement passwordInputBox = driver.findElement(By.name("password"));
            passwordInputBox.sendKeys("password@321");


            WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
            buttonSubmit.click();

            //Explicit wait for the specfic condition to be met:
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

            WebElement error_message = driver.findElement(By.className("notification-box-description"));
            Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");
            driver.quit();
        }
    }
}
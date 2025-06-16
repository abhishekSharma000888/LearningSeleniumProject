package ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium09_TestNGAssertions {

    @Test
    public void testAssertion(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        Assert.assertEquals(driver.getCurrentUrl(), "https://google.com");

    }
}

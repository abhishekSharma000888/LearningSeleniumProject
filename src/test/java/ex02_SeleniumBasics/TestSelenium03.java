package ex02_SeleniumBasics;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    //webdriver hierarchy

    //SearchContext(I) -> 2
    //Webdriver(I)
    //RemoteWebdriver(C)
    //ChromiumDriver(C)

    @Description("Open he app.vwo.com and verify the title!")
    @Test
    public void test_Selenium01() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        driver.close();
    }
}
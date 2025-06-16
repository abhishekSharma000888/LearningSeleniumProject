package ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium12_NavigationCommands {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        // driver.get lacks moving forward or backward
        // whereas navigateTo can do that too plus we can refresh the page as well.
    }
}

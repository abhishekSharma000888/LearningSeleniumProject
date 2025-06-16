package ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium10_MiniProject_Selenium extends CommonToAll {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() {
        WebDriver driver = openBrowser("https://katalon-demo-cura.herokuapp.com");

        try {
            boolean isTextPresent = driver.getPageSource().contains("CURA Healthcare Service");
            Assert.assertTrue(isTextPresent, "CURA Healthcare Service text is not visible");
            System.out.println("Testcase Passed!");
        } finally {
            closeBrowser(driver);
        }
    }
}

package ex05_seleniumwaits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSelenium22_Waits {

    @Test
    public void test_verify_imac_price(){

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://app.vwo.com");
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

        driver.close();

    }
}

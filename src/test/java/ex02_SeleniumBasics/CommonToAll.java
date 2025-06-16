package ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonToAll {

    public WebDriver openBrowser(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }

        public void closeBrowser(WebDriver driver) {
            if (driver != null) {
                driver.quit();
            }

    }

}

package ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium13_NOHTTPP {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("bing.com"); // complete url is required
    }
}

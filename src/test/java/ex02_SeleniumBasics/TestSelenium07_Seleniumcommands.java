package ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium07_Seleniumcommands {

    @Test
    public void test_SeleniumCmds(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");


//        driver.manage().window().maximize();
//        driver.manage().window().minimize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}

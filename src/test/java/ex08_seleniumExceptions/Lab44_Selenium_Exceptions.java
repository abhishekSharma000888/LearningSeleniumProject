package ex08_seleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import utilities.CommonToAll;

public class Lab44_Selenium_Exceptions extends CommonToAll {

    @Test
    public void test_selenium_exceptions() {

        driver.get("https://app.vwo.com/");
        System.out.println("Start of program");
        try {
            driver.findElement(By.id("Abhishek")); // org.openqa.selenium.NoSuchElementException: no such element
        } catch (NoSuchElementException e) {
            System.out.println("Element not found");
        }


    }
}

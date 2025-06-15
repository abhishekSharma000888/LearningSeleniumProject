package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium {

    @Test
    public void test_openVWOLoginPage() {

        // Initialize the ChromeDriver (launches a new Chrome browser instance)
        WebDriver driver = new ChromeDriver();

        // Load the VWO login page
        driver.get("https://app.vwo.com");

        // Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser and end the WebDriver session
        driver.quit();
    }
}

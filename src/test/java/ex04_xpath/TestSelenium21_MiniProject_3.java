package ex04_xpath;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21_MiniProject_3 {

    //Absolute XPath -> completely useless
    // it's the complete path from the root element

    //Relative XPath
    // it starts by referencing the element we want and go from there.
    //Core logic - //tagName[@attribute='value']
    // The XPath does not change even if we change the environments.

    //<input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">

    //input[@"name" ="username"]



    @Test
    @Description("To test the login")
    public void test_katalon_login() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");


        WebElement make_appointment_btn_xpath = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));

        make_appointment_btn_xpath.click();

        List<WebElement> username_input_box_xpath_placeholder = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_input_box_xpath_placeholder.get(1).sendKeys("John Doe");

        List<WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password_input_box.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login_input_box = driver.findElement(By.xpath("//*[@id=\"btn-login\"]"));
        login_input_box.click();

        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment" );

        driver.close();
    }

}

//input[@placeHolder="Email Address"]
//input[@placeHolder="Password"]
//input[@class=btn big-btn primary"]
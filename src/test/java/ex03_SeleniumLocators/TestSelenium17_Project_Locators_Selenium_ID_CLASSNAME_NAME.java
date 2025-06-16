package ex03_SeleniumLocators;

import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project_Locators_Selenium_ID_CLASSNAME_NAME {

    @Test
    @Description("Verify that with invalid credentials, wrror message is displayed!")
    @Owner("Abhishek")
    public void test_vwo_login_invalid_login(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/#/login");

        //Step 1 -> Find the email id and enter the details:
        //Step 2 -> Find the Password and enter 1234 which is the wrong entry.
        //Step 3 -> Submit and click the button.
        //Step 4 -> Wait for some time and verify the error message.

        //Step1:

        //<input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">


        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        //Step 2
        //<input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe">

       WebElement password_input_box = driver.findElement(By.name("password"));
       password_input_box.sendKeys("invalidpassword");

       //Step 3
        // <button type="submit" id="js-login-btn" class="btn btn--primary btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
        //									<span class="icon loader hidden" data-qa="zuyezasugu"></span>
        //									<span data-qa="ezazsuguuy">Sign in</span>
        //								</button>

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //Step 5 -> Verify the error message.

        // <div class="notification-box notification-box--filled notification-box--warning P(10px) Mb(20px)" id="js-notification-box" data-qa="tozemoxine">
        //					<div class="notification-box-icon T(0)" data-qa="rukubazewo">
        //						<svg ng-attr-width="{{iconWidth}}" ng-attr-height="{{iconHeight}}" icon-name="icon--exclamation-circled" icon-size="20" class="icon" data-qa="beqidawixu" id="js-notification-warning-icon" viewBox="0 0 32 32" width="20" height="20"> <!-- ngIf: iconTitle --> <use ng-attr-xlink:href="{{ '#' + iconName }}" xlink:href="#icon--exclamation-circled"></use> </svg>
        //						<svg ng-attr-width="{{iconWidth}}" ng-attr-height="{{iconHeight}}" icon-name="icon--info-circled" icon-size="20" class="icon hidden" id="js-notification-info-icon" viewBox="0 0 32 32" width="20" height="20"> <!-- ngIf: iconTitle --> <use ng-attr-xlink:href="{{ '#' + iconName }}" xlink:href="#icon--info-circled"></use> </svg>
        //					</div>
        //					<div class="notification-box-content" data-qa="miqunuyohi">
        //						<div class="notification-box-description" id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>
        //					</div>
        //				</div>

        WebElement error_message = driver.findElement(By.className("notification-box-content"));

        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        System.out.println("Test case passed!");
        driver.quit();


    }
}

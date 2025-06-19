package ex06_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab33_ActionsClasses {

    @Test
    public void test_SpiceJetLogin(){

        WebDriver driver = new ChromeDriver();
        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions = new Actions(driver);

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();
    }
}

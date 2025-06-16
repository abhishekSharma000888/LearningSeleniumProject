package ex01_selenium_basics;

import jdk.jfr.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Description("Open he app.vwo.com and verify the title!")
    @Test
    public void test_Selenium02(){

        EdgeDriver edgeDriver = new EdgeDriver();

        edgeDriver.get("https://app.vwo.com");

        Assert.assertEquals(edgeDriver.getCurrentUrl(),"https://app.vwo.com/#/login" );

        edgeDriver.quit();
    }
}

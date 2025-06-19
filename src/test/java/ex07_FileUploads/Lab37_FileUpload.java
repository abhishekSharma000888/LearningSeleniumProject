package ex07_FileUploads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.CommonToAll;

public class Lab37_FileUpload extends CommonToAll {

    @Test
    public void test_fileupload_p5() {

        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String working_dir = System.getProperty("user.dir");
        // /Users/promode/IdeaProjects/LearnSeleniumATB11x


        String path_file = working_dir + "src/test/java/utilities/data.txt";

        uploadFileInput.sendKeys(path_file);
        driver.findElement(By.name("submit")).click();
    }
}
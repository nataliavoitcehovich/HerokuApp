package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class herokuAppAddRemoveElementsTest {
    @Test
    public void herokuAppAddRemoveElementsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement buttonAdd = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        buttonAdd.click();
        buttonAdd.click();
        WebElement buttonDelete = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        buttonDelete.click();
        boolean isDeleteButtonDisplayed = driver.findElement(By.xpath("//*[@onclick='deleteElement()']")).isDisplayed();
        Assert.assertTrue(isDeleteButtonDisplayed);


        driver.quit();
    }
}

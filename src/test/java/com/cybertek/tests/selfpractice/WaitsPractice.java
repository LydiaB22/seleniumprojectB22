package com.cybertek.tests.selfpractice;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitsPractice {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //wait.until(ExpectedConditions.titleIs("Dynamic title"));
    }

    @Test
    public void test1() {
        String locator = "#checkbox>input";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.cssSelector(locator))));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
        driver.findElement(By.cssSelector(locator)).click();


    }

    @AfterMethod
    public void teardown(){

    }
}
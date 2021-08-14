package com.cybertek.tests.selfpractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Nadir_Project {

    public static void main(String[] args) throws InterruptedException {
        //Test Case 2/3
        //Go to Vytrack Login page
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://qa3.vytrack.com/user/login");

        //enter Truck Driver valid username
        WebElement username = driver.findElement(By.xpath("//input[@name='_username']"));
        username.sendKeys("User174");

        //enter Truck Driver valid password
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.xpath("//input[@name='_password']"));
        password.sendKeys("UserUser123");

        //click login button
        WebElement button = driver.findElement(By.xpath("//button[contains(@class,'pull-right')]"));
        button.click();



        //User should see error message
        //User should NOT be able to logged into  Vytrack Truck Driver’ Account

    }
}
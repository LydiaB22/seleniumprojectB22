package com.cybertek.tests.selfpractice;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class assignment5 {
    public static void main(String[] args) throws InterruptedException {

       Driver.getDriver().get("https://qa3.vytrack.com/user/login");

        //enter Truck Driver valid username
       WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='_username']"));
       username.sendKeys("User174");

        //enter Truck Driver valid password
        Thread.sleep(3000);
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='_password']"));
        password.sendKeys("UserUser123");

        //click login button
        WebElement button = Driver.getDriver().findElement(By.xpath("//button[contains(@class,'pull-right')]"));
        button.click();


        //hover over to Fleet
        Actions actions = new Actions(Driver.getDriver());
      //  actions.moveToElement(img1).perform();

        //click vehicle options


        //click export grid

    }
}

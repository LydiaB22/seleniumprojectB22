package com.cybertek.tests.selfpractice;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ActionsPractice {

    @Test
    public void dragAndDrop() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/drag_and_drop");

        WebElement draggable = Driver.getDriver().findElement(By.id("column-a"));
        WebElement droptarget = Driver.getDriver().findElement(By.id("column-b"));
        Thread.sleep(3000);
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(draggable, droptarget).perform();
        Thread.sleep(2000);
        Driver.getDriver().close();
    }

    @Test
    public void hoverTest() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        Actions actions = new Actions(Driver.getDriver());
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img1Text = Driver.getDriver().findElement(By.xpath("//*[text()='name: user1']"));
        Thread.sleep(2000);
        actions.moveToElement(img1).perform();
        Thread.sleep(2000);
        Assert.assertTrue(img1Text.isDisplayed());
        List<WebElement> images = Driver.getDriver().findElements(By.tagName("img"));
        for(WebElement image: images){
            actions.moveToElement(image).pause(2000).perform();
        }
        Driver.getDriver().close();
    }
}

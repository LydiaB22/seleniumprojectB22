package com.cybertek.tests.selfpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_PracticeCybertek_URL {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement email = driver.findElement(By.name("email"));

        email.sendKeys("svelidiya@gmail.com");
        WebElement retrieve = driver.findElement(By.cssSelector("button[id='form_submit']"));
        retrieve.click();
        String expectedURL = "email_sent";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedURL)) {
            System.out.println("URL verification PASSED!");
        } else {
            System.out.println("URL verification FAILED!");
        }
        String expText = "Your e-mail's been sent!";
        Thread.sleep(1);
        WebElement actualText = driver.findElement(By.cssSelector("h4[name='confirmation_message']"));
        String actTextToString=actualText.getText();
        System.out.println(actTextToString);
        if (actTextToString.contains(expText)) {
            System.out.println("text verification PASSED!");
        } else {
            System.out.println("text verification FAILED!");
        }



    }

}


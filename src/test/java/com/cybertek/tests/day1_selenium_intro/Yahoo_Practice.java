package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public static void main(String[] args){
        //TC #1: Yahoo Title Verification
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //1.Open Chrome Browser
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        //2.Go to https://www.yahoo.com
        driver.get("https://yahoo.com");

        //3/ Verify title:
        //expected: Yahoo
        String expectedTitle = "Yahoo";
        System.out.println("expectedTitle = " + expectedTitle);
        //actual title
        String actualTitle =  driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        //creating our verification
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else{
            System.out.println("Title is not as expected. Verification FAILED!");
        }

        //close the browser
        driver.close();





    }
}

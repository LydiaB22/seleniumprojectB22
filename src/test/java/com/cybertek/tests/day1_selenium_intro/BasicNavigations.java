package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1-setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of selenium web driver
        //this line opens a browser
        WebDriver driver = new ChromeDriver();

        //this line will maximize the browser size
        driver.manage().window().maximize();

        //will work for mac only, won't work in windows
        //driver.manage().window().fullscreen();

        //3-get the page for Tesla.com
        driver.get("https://www.tesla.com");

        System.out.println("Current title " + driver.getTitle());
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL " + driver.getCurrentUrl());
        System.out.println("currentURL = " + currentURL);

        //putting three seconds of wait/stop the code for 3 sec
        Thread.sleep(3000);
        //Going back using navigations
        driver.navigate().back();

        //putting three seconds of wait/stop the code for 3 sec
        Thread.sleep(3000);
        //Going forward using navigations
        driver.navigate().forward();

        //putting three seconds of wait/stop the code for 3 sec
        Thread.sleep(3000);
        //Refreshing the page using navigations
        driver.navigate().refresh();

        //putting three seconds of wait/stop the code for 3 sec
        Thread.sleep(3000);
        //going to another url using.to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title " + driver.getTitle());
        System.out.println("Current URL " + driver.getCurrentUrl());
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //this method will close the currently opened browser
        //it will only close 1 browser or 1 tab
        //driver.close();

        //driver.quit();


    }
}

package com.cybertek.tests.selfpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Rahib_class {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://qa3.vytrack.com/user/login");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user168");

        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("UserUser123"+ Keys.ENTER);

        driver.navigate().refresh();

        List<WebElement> activitiesButton = driver.findElements(By.xpath("//span[@class='title title-level-1']"));
        activitiesButton.get(2).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[.='Calendar Events']")).click();


        WebElement calendarEvent = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));

        calendarEvent.click();

        driver.findElement(By.xpath("//input[@data-name='field__title']")).sendKeys("Truck Driver");

        driver.findElement(By.xpath("//button[@class='btn btn-success action-button']")).click();






/**
        @Test

        public void vTruck() throws InterruptedException {

            getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            getDriver().findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user168");

            WebElement passWord = getDriver().findElement(By.xpath("//input[@type='password']"));
            passWord.sendKeys("UserUser123"+ Keys.ENTER);

            getDriver().navigate().refresh();

            List<WebElement> activitiesButton = getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
            activitiesButton.get(2).click();

            Thread.sleep(3000);

            getDriver().findElement(By.xpath("//span[.='Calendar Events']")).click();

            Thread.sleep(3000);

            WebElement reset = getDriver().findElement(By.xpath("//i[@class='fa-repeat']"));
            reset.click();


            Thread.sleep(3000);

            WebElement calendarEvent = getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));

            calendarEvent.click();

            getDriver().findElement(By.xpath("//input[@data-name='field__title']")).sendKeys("Truck Driver");

            getDriver().findElement(By.xpath("//button[@class='btn btn-success action-button']")).click();



        }
    }






    protected static ThreadLocal<ChromeDriver> getDriver = new ThreadLocal<>();

    @BeforeMethod

    public void setup(){

        WebDriverManager.chromedriver().setup();
        getDriver.set(new ChromeDriver());

        getDriver().get("https://qa3.vytrack.com/user/login");

        getDriver().manage().window().maximize();

    }

    public WebDriver getDriver(){
        return getDriver.get();
    }

    @AfterMethod

    public void tearDown(){
        getDriver().quit();
    */
    }

}






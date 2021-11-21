package com.cybertek.tests.selfpractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PracticeDropdowns {
    static WebDriver driver = WebDriverFactory.getDriver("chrome");

    public static void main(String[] args) throws InterruptedException {
        // selectByText();
        // selectByValue();
        //selectByIndex();
       // selectAllTest();
        nonSelectDropdown();
    }

    public static void setup() {

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    public static void selectByText() throws InterruptedException {
        setup();
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        Thread.sleep(2000);
        driver.close();
    }

    public static void selectByValue() throws InterruptedException {
        setup();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByValue("DC");
        Thread.sleep(2000);
        String expected = "District of Columbia";
        String actual = select.getFirstSelectedOption().getText();
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
        driver.close();
    }

    public static void selectByIndex() throws InterruptedException {
        setup();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByIndex(1);
        Thread.sleep(2000);
        String expected = "Alabama";
        String actual = select.getFirstSelectedOption().getText();
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
        driver.close();
    }

    public static void selectAllTest() throws InterruptedException {
        setup();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.name("Languages")));
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            Thread.sleep(1000);
            select.selectByVisibleText(option.getText());
        }
        Thread.sleep(1000);
        List<WebElement>selectedOtions = select.getAllSelectedOptions();
        for(WebElement option:selectedOtions){
            System.out.println(option.getText());
        }
        Thread.sleep(3000);
        select.deselectAll();
        Thread.sleep(1000);
        driver.close();
    }

    public static void nonSelectDropdown() throws InterruptedException {
        setup();
        WebElement dropdown = driver.findElement(By.id("dropdownMenuLink"));
        WebElement option = driver.findElement(By.xpath("//a[normalize-space()='Amazon']"));
        dropdown.click();;
        Thread.sleep(1000);
        option.click();
        driver.close();
    }
}
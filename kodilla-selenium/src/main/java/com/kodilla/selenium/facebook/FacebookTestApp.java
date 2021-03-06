package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestApp {
    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
       driver.switchTo().frame(0);
        WebElement yearCombo = driver.findElement(
                By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));

        Select yearSelect = new Select(yearCombo);
        yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }
}
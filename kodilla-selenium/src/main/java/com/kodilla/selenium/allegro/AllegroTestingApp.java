
package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");
        driver.findElement(By.xpath("/html/body/div[3]/div[10]/div/div/div/div/div[2]/div[2]/button[1]")).click();

        WebElement inputField = driver.findElement(By.name("string"));
        inputField.sendKeys("Mavic mini");

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@class=\"main-wrapper\"]/div/header/div/div/div/div/form/div/div/select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        WebElement searchField = driver.findElement(By.xpath("//*[@class=\"main-wrapper\"]/div/header/div/div/div/div/form/button"));
        searchField.click();
    }
}


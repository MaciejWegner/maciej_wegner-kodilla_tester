
//package com.kodilla.selenium.allegro;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class AllegroTestingApp { //13.4
//
//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.allegro.pl/");
//        driver.findElement(By.xpath("/html/body/div[2]/div[9]/div/div/div/div/div[2]/div[2]/button[1]")).click();
//        WebElement inputField = driver.findElement(By.xpath("//input[@placeholder=\"czego szukasz?\"]"));
//        inputField.sendKeys("mavic mini");
//
//        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
////        WebElement inputField = driver.findElement(By.name("string"));
////        inputField.sendKeys("Mavic mini");
////
//      WebElement categoryCombo = driver.findElement(By.xpath("//*[@class=\"main-wrapper\"]/div/header/div/div/div/div/form/div/div/select"));
//        Select categorySelect = new Select(categoryCombo);
//        categorySelect = new Select(categoryCombo);
//        categorySelect.selectByIndex(3);
//
//        WebElement searchField = driver.findElement(By.xpath("//*[@class=\"main-wrapper\"]/div/header/div/div/div/div/form/button"));
//        searchField.click();
//    }
//}

package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp { //13.5


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");
        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
        ///html/body/div[3]/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[2]/div/select/option[1]
        WebElement categoryCombo = driver.findElement(By.xpath("//*[@class=\"main-wrapper\"]/html/body/div[3]/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[2]/div/select/option[1]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);
    }
}
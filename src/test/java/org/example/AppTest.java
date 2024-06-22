package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class AppTest
{
    @Test
public void firstTest(){
        WebDriver driver = new ChromeDriver ();
        System.setProperty ("webdriver.chrome.driver", "C:\\Users\\LenoVich\\IdeaProjects\\ua.com.google\\src\\test\\resources\\chromedriver.exe");
        driver.get ("https://www.google.com/");
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/span/span/g-popup/div[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/g-menu/g-menu-item[1]/div/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/g-menu/g-menu-item[2]/div/div")).click();
        driver.findElement(By.xpath(" /html/body/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/span[2]/span")).click();
        driver.findElement(By.xpath(" /html/body/div[6]/div/div[2]/span/div/g-radio-button-group/div[1]/div[3]")).click();
        driver.findElement(By.xpath(" /html/body/div[6]/div/div[2]/span/div/div[2]/span[2]")).click();
    }
}
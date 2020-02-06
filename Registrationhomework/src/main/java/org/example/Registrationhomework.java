package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registrationhomework
{
    static protected WebDriver driver;
    public static void main(String[] args)
    {
    System.setProperty("webdriver.chrome.driver" , "src\\test\\java\\BrowserDrivers\\chromedriver");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://www.sainsburys.co.uk/");
    driver.findElement(By.id("Register")).click();






    }

}

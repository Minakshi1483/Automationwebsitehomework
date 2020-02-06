package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebExercise1 {
    static protected WebDriver driver;
    @Test
    public void userShouldAbleToRegisterSuccessfully()

     {
        System.setProperty("webdriver.chrome.driver" , "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("register-button")));


        driver.findElement(By.id("FirstName")).sendKeys("Minakshi");
        driver.findElement(By.id("LastName")).sendKeys("Shah");
         driver.findElement(By.id("Email")).sendKeys("testtesttest@test.com");
         driver.findElement(By.id("Password")).sendKeys("xyz");
         driver.findElement(By.id("ConfirmPassword")).sendKeys("xyz");
         driver.findElement(By.id("register-button")).click();
     }

}

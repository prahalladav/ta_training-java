package com.epam.training.student_Prahallada_V;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class Task1 {
    @Test
    public void Test1(){
        System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\prahallada_v\\Downloads\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://pastebin.com/");

        driver.findElement(By.id("postform-text")).sendKeys("Hello from WebDriver");
        driver.findElement(By.xpath("//span[@id='select2-postform-expiration-container']")).click();
        Robot rb = null;
        try {
            rb = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }


        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);

        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(By.id("postform-name")).sendKeys("helloweb");

        WebElement sb;
        sb = driver.findElement(By.xpath("//button[text()='Create New Paste']"));

        sb.click();


    }
}

package com.epam.training.student_Prahallada_V;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Task2 {
    @Test

    public void Task2() {

        System.setProperty("webdriver.geckodriver.driver","C:\\Users\\prahallada_v\\Downloads\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.pastebin.com");

        driver.findElement(By.id("postform-text")).sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "            git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "            git push origin master --force\n");

        driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[2]")).click();

        Robot rb=null;
        try{
            rb = new Robot();
        }catch (AWTException e ) {
            throw new RuntimeException(e);
        }

        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);


        driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[3]")).click();

        Robot rb1=null;
        try{
            rb1 = new Robot();
        }catch (AWTException e ) {
            throw new RuntimeException(e);
        }

        rb1.keyPress(KeyEvent.VK_DOWN);
        rb1.keyRelease(KeyEvent.VK_DOWN);

        rb1.keyPress(KeyEvent.VK_DOWN);
        rb1.keyRelease(KeyEvent.VK_DOWN);


        rb1.keyPress(KeyEvent.VK_ENTER);
        rb1.keyRelease(KeyEvent.VK_ENTER);



        driver.findElement(By.id("postform-name")).sendKeys("how to gain dominance among developers");

        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

//         driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys("how to gain dominance among developers", Keys.ENTER);
//
//        String expectedTitle="how to gain dominanace among developers - Google Search";
//        String actualTitle=driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle);
        driver.quit();

    }
}

package com.epam.training.student_Prahallada_V;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Task3
{
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver d= new ChromeDriver();
        d.get("https://cloud.google.com/products/calculator");
        d.manage().window().maximize();
        Thread.sleep(2000);
        d.findElement(By.xpath("//span[@class='UywwFc-vQzf8d']")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//p[text()='A secure and customizable compute service that lets you create and run virtual machines on Google’s infrastructure. Compute Engine includes the following services: Instances, Sole-tenant Nodes, Machine Images.']")).click();
        Thread.sleep(2000);
        WebElement c=d.findElement(By.xpath("(//div[@class='wX4xVc-Bz112c-RLmnJb'])[2]"));
        for(int i=0;i<3;i++)
        {
            c.click();
            try {
                Thread.sleep(2000); // 1000 milliseconds = 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread.sleep(2000);
        d.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[4]")).click();
        Robot r= new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(2000);
        d.findElement(By.xpath("//label[text()='Regular']")).click();

        Thread.sleep(1000);
        d.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[5]")).click();
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);  //Machine Family
        Thread.sleep(1000);

        d.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[6]")).click();
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);  //series n1
        Thread.sleep(1000);

        d.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[7]")).click();
        Thread.sleep(1000);

        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);  //n1standard8
        Thread.sleep(1000);

        d.findElement(By.xpath("(//span[@class='eBlXUe-hywKDc'])[6]")).click();  //selecting
        Thread.sleep(2000);

        d.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[8]")).click();
        Thread.sleep(1000);

        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);  //nvdv100
        Thread.sleep(1000);

        d.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[9]")).click();
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);  //gpu-1
        Thread.sleep(1000);


        d.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[10]")).click();
        Thread.sleep(1000);

        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);  //local sd-2*375gb
        Thread.sleep(1000);


        d.findElement(By.xpath("(//div[@class='VfPpkd-aPP78e'])[11]")).click();
        Thread.sleep(1000);

        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);  //netherlands
        Thread.sleep(1000);

        d.findElement(By.xpath("//label[@for='1-year']")).click();   //commited-1year
        Thread.sleep(3000);

        WebElement e1=d.findElement(By.xpath("//span[@class='FOBRw-RLmnJb']"));   //share button
        Thread.sleep(1000);

        Actions act= new Actions(d);
        act.moveToElement(e1).click().perform();
        Thread.sleep(1000);
        d.findElement(By.xpath("//a[@track-name='open estimate summary']")).click();   //open estimate summary
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(d.getWindowHandles());
        d.switchTo().window(tabs.get(1));

       //instances
        String expectedNumberOfInstances = "4";
        String actualNumberOfInstances = d.findElement(By.xpath("(//span[@class='Kfvdz'])[10]")).getText() ;
        Assert.assertEquals( expectedNumberOfInstances , actualNumberOfInstances );

        // cinstances
        String expectedOperatingSystem = "Free: Debian, CentOS, CoreOS, Ubuntu or BYOL (Bring Your Own License)";
        String actualOperatingSystem = d.findElement(By.xpath("(//span[@class='Kfvdz'])[11]")).getText() ;
        Assert.assertEquals( expectedOperatingSystem , actualOperatingSystem);

  
        String expectedProvisioningModel = "Regular";
        String actualProvisioningModel = d.findElement(By.xpath("(//span[@class='Kfvdz'])[12]")).getText() ;
        Assert.assertEquals(expectedProvisioningModel, actualProvisioningModel);

         // checking for machine type
        String expectedMachineType = "n1-standard-8, vCPUs: 8, RAM: 30 GB";
        String actualMachineType = d.findElement(By.xpath("(//span[@class='Kfvdz'])[3]")).getText() ;
        Assert.assertEquals(expectedMachineType, actualMachineType);

        // checking Select GPU Toggle
        String expectedGpuToggle = "true";
        String actualGpuToggle = d.findElement(By.xpath("(//span[@class='Kfvdz'])[16]")).getText() ;
        Assert.assertEquals(expectedGpuToggle, actualGpuToggle);

       // checking Gpu Type
        String expectedGpuType = "NVIDIA V100";
        String actualGpuType = d.findElement(By.xpath("(//span[@class='Kfvdz'])[5]")).getText() ;
        Assert.assertEquals(expectedGpuType, actualGpuType);
        
        // checking Number of Gpus
        String expectedNumberOfGpus = "1";
        String actualNumberOfGpus = d.findElement(By.xpath("(//span[@class='Kfvdz'])[6]")).getText() ;
        Assert.assertEquals(expectedNumberOfGpus, actualNumberOfGpus);

        // checking Local SSD
        String expectedLocalSsd = "2x375 GB";
        String actualLocalSsd = d.findElement(By.xpath("(//span[@class='Kfvdz'])[7]")).getText() ;
        Assert.assertEquals(expectedLocalSsd, actualLocalSsd);

       // checking Region
        String expectedRegion = "Netherlands (europe-west4)";
        String actualRegion = d.findElement(By.xpath("(//span[@class='Kfvdz'])[18]")).getText() ;
        Assert.assertEquals(expectedRegion, actualRegion);

        // Checking Commited use discount options
        String expectedCommitedUse = "1 year";
        String actualCommitedUse = d.findElement(By.xpath("(//span[@class='Kfvdz'])[19]")).getText() ;
        Assert.assertEquals(expectedCommitedUse, actualCommitedUse);
        
        d.quit();
    }

}

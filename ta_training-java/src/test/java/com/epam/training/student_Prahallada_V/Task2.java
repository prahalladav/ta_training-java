package com.epam.training.student_Prahallada_V;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Task2
{
    WebDriver d=new ChromeDriver();

    @BeforeClass

    public void launchingBrowser()
    {
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        d.get("https://pastebin.com");
        d.manage().window().maximize();
    }

    @Test(priority = 1)
    public void steps() throws InterruptedException, AWTException
    {
        d.findElement(By.id("postform-text")).sendKeys("git config --global user.name  'New Sheriff in Town'\n" +
                "            git reset $(git commit-tree HEAD^{tree} -m 'Legacy code')\n" +
                "            git push origin master --force");


      
        d.findElement(By.xpath("//span[@id='select2-postform-format-container']")).click();

        Robot rb= new Robot();
        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        d.findElement(By.xpath("//span[@id='select2-postform-expiration-container']")).click();
        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);

        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        d.findElement(By.id("postform-name")).sendKeys("how to gain dominance among developers");

        d.findElement(By.xpath("//button[text()='Create New Paste']")).click();

    }
    @Test(priority = 2)
    public void titleCheck()
    {
        String pageTitle = d.getTitle();
        String expectedTitle = "how to gain dominance among developers";
        Assert.assertFalse(pageTitle.contains(expectedTitle));

    }
    @Test(priority = 3)
    public void syntaxCheck()
    {
        WebElement syntaxHighlightedCode = d.findElement(By.xpath("//span[@id='select2-postform-format-container']"));
        String codeText = syntaxHighlightedCode.getText();
        String expect="Bash";
        assert codeText.equals(expect);

    }
    @Test(priority = 4)
    public void codeCheck()
    {
        String expectedPara = "git config --global user.name  'New Sheriff in Town'\n" +
                "            git reset $(git commit-tree HEAD^{tree} -m 'Legacy code')\n" +
                "            git push origin master --force";

        String actualPara=d.findElement(By.id("postform-text")).getText();
        Assert.assertEquals(actualPara,expectedPara);

    }

    @AfterClass
    public void closeBrowser()
    {
        d.quit();

    }

}

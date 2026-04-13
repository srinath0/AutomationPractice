package org.example.Tests;

import org.example.pages.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FaceBookErrorValidations {
    @Test
    public void errorcheck(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        Utils.getWait(driver,10);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement Username= driver.findElement(By.xpath("//input[@name='email']/parent::div"));
        js.executeScript("arguments[0].value='stupid';",Username);
        Utils.getWait(driver,10);
        WebElement password= driver.findElement(By.xpath("//input[@type='password']/parent::div"));
        js.executeScript("arguments[0].value='stupid';",password);
        Utils.getWait(driver,10);
        driver.findElement(By.xpath("(//span[contains(text(),'Log in')])[2]")).click();
        Utils.WaitForVisibilityOfTheElement(driver,By.xpath("//a[contains(text(),'Find your account and log in.')]/parent::span"));
        WebElement ErrorMsg= driver.findElement(By.xpath("//a[contains(text(),'Find your account and log in.')]/parent::span"));
        String Text=ErrorMsg.getText();
        Assert.assertTrue(Text.contains("isn't connected"));
    }
}

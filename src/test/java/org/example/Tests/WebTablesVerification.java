package org.example.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebTablesVerification {
    @Test
    public void WebTables(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='edit-record-3']")));
        WebElement clickedit=driver.findElement(By.xpath("//span[@id='edit-record-3']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",clickedit);
        WebElement age= driver.findElement(By.xpath("//input[@id='age']"));
        age.clear();
        age.sendKeys("30");
        WebElement salary= driver.findElement(By.xpath("//input[@id='salary']"));
        salary.clear();
        salary.sendKeys("5000");
        WebElement department= driver.findElement(By.xpath("//input[@id='department']"));
        department.clear();
        department.sendKeys("ILLEGAL");
        driver.findElement(By.xpath("//button[@id='submit']")).submit();
    }
}

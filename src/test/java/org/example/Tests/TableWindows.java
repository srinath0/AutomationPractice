package org.example.Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TableWindows {
    @Test
    public void triggeralert() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='example']/a")));
        String parentWindow= driver.getWindowHandle();
        driver.findElement(By.xpath("//div[@class='example']/a")).click();
        for(String window: driver.getWindowHandles()){
            if(!window.equals(parentWindow)){
                driver.switchTo().window(window);
                break;
            }
        }
        wait.until(ExpectedConditions.titleContains("New Window"));
        driver.switchTo().window(parentWindow);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("alert('This is a test alert!');");
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(5000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.quit();
    }
}

package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {
    public static void WaitForPageLoad(WebDriver driver, By Locator){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
    }
    public static boolean pagecontins(WebDriver driver,String title){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.titleContains(title));
    }
    public static WebDriverWait getWait(WebDriver driver, int seconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(seconds));
    }
    // Check if page source contains text
    public static boolean pageContains(WebDriver driver, String text) {
        return driver.getPageSource().contains(text);
    }

}

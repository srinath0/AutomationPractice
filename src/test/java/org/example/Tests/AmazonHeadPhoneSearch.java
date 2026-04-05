package org.example.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AmazonHeadPhoneSearch {
    @Test
    public void search(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
        WebElement searchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("headphones");
        searchBox.submit();
        WebElement firstproduct= driver.findElement(By.xpath("//div[@data-cy='title-recipe'][1]/a[1]"));
        String productText=firstproduct.getText();
        String parentWindow= driver.getWindowHandle();
        firstproduct.click();
        for(String window: driver.getWindowHandles()){
            if(!window.equals(parentWindow)){
                driver.switchTo().window(window);
                break;
            }
        }
        WebElement price= driver.findElement(By.xpath("//span[@class='a-price-whole']"));
        String actualPrice= price.getText();
        System.out.println(actualPrice);
        WebElement AddtoCart= driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        AddtoCart.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'Added to cart')]")));
        System.out.println(productText);
        Assert.assertTrue(productText.contains("Headphones"));
        driver.quit();
    }
}

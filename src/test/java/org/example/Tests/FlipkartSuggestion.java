package org.example.Tests;

import org.example.pages.Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class FlipkartSuggestion {
    @Test
    public void phonesuggestion() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Utils.WaitForVisibilityOfTheElement(driver,By.xpath("//span[@role='button']"));
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Utils.getWait(driver,10);
        Utils.WaitForVisibilityOfTheElement(driver,By.xpath("//a[@title='Login']/img"));
        driver.findElement(By.xpath("//a[@title='Login']/img")).click();
        WebElement mobileNumber = driver.findElement(By.xpath("//span[contains(text(),'Enter Email/Mobile number')]"));
        Utils.getWait(driver,10);
        Actions actions = new Actions(driver);
        actions.moveToElement(mobileNumber).sendKeys("9581734787").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(50000);
        //driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Utils.getWait(driver,10);
        Utils.conditionWait(driver, By.xpath("(//input[@title='Search for Products, Brands and More'])[2]"));
        Utils.WaitForVisibilityOfTheElement(driver,By.xpath("(//input[@title='Search for Products, Brands and More'])[2]"));
        WebElement searchBox= driver.findElement(By.xpath("(//input[@title='Search for Products, Brands and More'])[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchBox);
        searchBox.sendKeys("phone");
        Utils.getWait(driver,15);
        Utils.WaitForVisibilityOfTheElement(driver,By.tagName("li"));
        List<WebElement> suggestions=driver.findElements(By.tagName("li"));
        for(WebElement suggestion:suggestions){
            String text=suggestion.getText();
            if(text.contains("s under 15000")){
                Actions action=new Actions(driver);
                action.moveToElement(suggestion).click().perform();
                break;
            }
        }
        Utils.WaitForVisibilityOfTheElement(driver,By.xpath("//span[contains(text(),'phones under 15000')]"));
        driver.quit();
    }
}

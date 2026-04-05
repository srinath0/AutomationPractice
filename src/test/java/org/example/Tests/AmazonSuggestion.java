package org.example.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AmazonSuggestion {
    @Test
    public void amazon(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchBox= driver.findElement(By.xpath("//div[@id='a-page']//header[@id='navbar-main']//div[@id='navbar']/div[1]/div[2]/div/form/div[2]/div[1]/input"));
        searchBox.clear();
        searchBox.sendKeys("r");
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("two-pane-results-container")));
//        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
//                By.cssSelector("div.s-suggestion"), 0
//        ));
//        WebElement suggestion = wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//div[contains(@class, 's-suggestion') and contains(., 'realme 15 pro')]")
//        ));
//        System.out.println("Found suggestion: " + suggestion.getText());
//        suggestion.click();
//        wait.until(ExpectedConditions.titleContains("realme 15 pro"));
//        System.out.println("Successfully navigated to realme 15 pro search results");
        driver.quit();
    }
}

// Amazonsuggestionclick.java
package org.example.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.example.pages.Utils;

import java.util.List;

public class Amazonsuggestionclick {

    @Test
    public void phoneClick() {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://www.amazon.in/");

            // Wait for search box to be visible
            Utils.WaitForPageLoad(driver, By.id("twotabsearchtextbox"));

            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.clear();
            searchBox.sendKeys("Phone");

            // Wait for suggestions to load
            Utils.getWait(driver, 5)
                    .until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                            By.xpath("//div[contains(@class,'s-suggestion-container')]")));

            List<WebElement> suggestions = driver.findElements(
                    By.xpath("//div[contains(@class,'s-suggestion-container')]"));

            boolean clicked = false;

            for (WebElement suggestion : suggestions) {
                String suggestionText = suggestion.getText().trim();

                if (suggestionText.contains(" under 15k")) {
                    System.out.println("Found suggestion: " + suggestionText);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(suggestion).click().perform();
                    clicked = true;
                    break;
                }
            }

            if (!clicked) {
                System.out.println("Suggestion 'under 15k' not found!");
            }
            Utils.getWait(driver, 10)
                    .until(ExpectedConditions.titleContains("Results"));

            if (Utils.pageContains(driver, "Results")) {
                System.out.println("Results page loaded successfully");
            } else {
                System.out.println("Results page not loaded");
            }

        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
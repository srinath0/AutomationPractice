package org.example.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AutomationChallenge1 {
    @Test
    public void amtcalculation() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Password@123");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("log-in"))).click();
        List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
        double credit = 0.0;
        double debit = 0.0;
        for (WebElement row : rows) {
            WebElement priceCell = row.findElement(By.xpath("./td[5]/span"));
            String priceText = priceCell.getText().replace("USD", "").trim();
            System.out.println("Raw value: " + priceText);
            if (priceText.startsWith("+")) {
                String stramount=priceText.replace("+","").replace(",","").trim();
                double amount = Double.parseDouble(stramount);
                credit += amount;
            } else if (priceText.startsWith("-")) {
                double amount = Double.parseDouble(priceText.replace("-", "").replace(",","").trim());
                debit += amount;
            }
        }
        double finalAmt = credit - debit;
        System.out.println("Total Credit: " + credit);
        System.out.println("Total Debit: " + debit);
        System.out.println("Final Amount: " + finalAmt);

        driver.quit();
    }
}
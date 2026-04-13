package org.example.Tests;

import org.example.pages.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;

public class AddRemoveElements {
    @Test
    public void addDelete() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement add = driver.findElement(By.xpath("//button[text()='Add Element']"));
        for (int i = 0; i < 5; i++) {
            add.click();
        }
        List<WebElement> deletes = driver.findElements(By.xpath("//button[text()='Delete']"));
        Assert.assertEquals(deletes.size(), 5);
        for (int i = 0; i < 2; i++) {
            driver.findElement(By.xpath("//button[text()='Delete']")).click();
        }
        List<WebElement> remaining = driver.findElements(By.xpath("//button[text()='Delete']"));
        Assert.assertEquals(remaining.size(), 3);
    }
}

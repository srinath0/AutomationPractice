package org.example.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TableDataFetch {
    @Test
    public void tablefind(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> rows= driver.findElements(By.xpath("//tbody[1]/tr[1]"));
        for(WebElement row:rows){
            WebElement email= driver.findElement(By.xpath("//td[3]"));
            String emailText=email.getText();
            Assert.assertTrue(emailText.contains("@"));
            System.out.println(emailText);
            WebElement DueAmount= driver.findElement(By.xpath("//td[4]"));
            String price=DueAmount.getText();
            Assert.assertTrue(price.contains("$"));
            System.out.println(price);
        }
        driver.quit();
    }
}

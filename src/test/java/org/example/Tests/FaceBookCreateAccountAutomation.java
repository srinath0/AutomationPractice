package org.example.Tests;

import org.example.pages.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookCreateAccountAutomation {
    @Test
    public void createAccount(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement createAccount= driver.findElement(By.xpath("//span[contains(text(),'Create new account')]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click",createAccount);
        Utils.getWait(driver,20);
        Utils.WaitForVisibilityOfTheElement(driver,By.xpath("//label[contains(text(),'First name')]/parent::div"));
        WebElement firstName= driver.findElement(By.xpath("//label[contains(text(),'First name')]/parent::div"));
        firstName.sendKeys("srinath");
        WebElement LastName= driver.findElement(By.xpath("//label[contains(text(),'Surname')]/parent::div"));
        LastName.sendKeys("keshetti");
//        Utils.WaitForVisibilityOfTheElement(driver,By.xpath("//span[contains(text(),'Day')]/following-sibling::div"));
//        Utils.WaitForElementToBeClickable(driver,By.xpath("//span[contains(text(),'Day')]/following-sibling::div"));
//        WebElement Dayselect=driver.findElement(By.xpath("//span[contains(text(),'Day')]/following-sibling::div"));
//        Dayselect.

    }
}

package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Input {

    @Test
    public void Input(){
        // open page
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://the-internet.herokuapp.com/inputs";
        driver.get(url);
        driver.manage().window().maximize();

         // add number to input
        WebElement usernameInput = driver.findElement(By.xpath("2"));
        usernameInput.sendKeys("-1");

        Assert.assertTrue(usernameInput.getText().contains("-1"));
        // verify input value
    }
}

package com.hitachigroupid.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
public WebDriver driver;

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("submit");
    By successMsg = By.xpath("//h1[normalize-space()='Logged In Successfully']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
        System.out.println("User enters name" + username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        System.out.println("User enters password" +password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getLoginSuccessMsg()
    {
       return driver.findElement(successMsg).getText();
    }
    
}

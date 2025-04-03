package com.hitachigroupid.steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.hitachigroupid.pages.LoginPage;
import com.hitachigroupid.utils.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    WebDriver driver = DriverManager.getDriver();
    LoginPage loginPage;


    @Given("User is on login page")
    public void user_is_on_login_page() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage = new LoginPage(driver); 
    }
      @When("User enter valid username and password")
      public void user_enter_valid_username_and_password() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
    }

    @When("Clicks on the login button")
    public void clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("User is logged in successfully")
    public void user_is_logged_in_successfully() {
        String expected = "Logged In Successfully";
        String actual = loginPage.getLoginSuccessMsg();

        Assert.assertEquals(actual, expected);
        driver.quit();
    }
    
}

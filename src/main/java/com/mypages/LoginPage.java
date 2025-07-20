package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{


    //page locator
    private By username = By.name("username");
    private By password = By.name("password");
    private By loginButton = By.className("orangehrm-login-button");
    private By header = By.className("orangehrm-login-title");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUsername() {
        return getElement(username);
    }

    public WebElement getPassword() {
        return getElement(password);
    }

    public WebElement getLoginButton() {
        return getElement(loginButton);
    }

    public WebElement getHeader(){
        return getElement(header);
    }

    public String getLoginPageTitle(){
        return getPageTitle();
    }

    public String getLoginPageHeader(){
        return getPageHeader(header);
    }


    public HomePage doLogin(String username, String password){
        getUsername().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return getInstance(HomePage.class);
    }

    public void doLogin(){
        getUsername().sendKeys("");
        getPassword().sendKeys("");
        getLoginButton().click();
    }
}

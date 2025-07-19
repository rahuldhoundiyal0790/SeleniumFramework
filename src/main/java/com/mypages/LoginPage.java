package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{


    //page locator
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.id("loginBtn");
    private By header = By.xpath("//i18n-string[@data-key='login.signupLink.text']");
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

    public String getPageHeader(){
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

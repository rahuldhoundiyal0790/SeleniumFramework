package tests;

import com.mypages.HomePage;
import com.mypages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void verifyLoginPageTitleTest(){
     String title = page.getInstance(LoginPage.class).getLoginPageTitle();
     System.out.println(title);
     Assert.assertEquals(title, "OrangeHRM");
 }

    @Test(priority = 2)
    public void verifyLoginPageHeaderTest(){
        String header = page.getInstance(LoginPage.class).getLoginPageHeader();
        System.out.println(header);
        Assert.assertEquals(header, "Login");
    }

    @Test(priority = 3)
        public void doLoginTest(){
       HomePage homePage= page.getInstance(LoginPage.class).doLogin("Admin","admin123");
       String headerHome = homePage.getHomePageHeader();
       System.out.println(headerHome);
    }
}

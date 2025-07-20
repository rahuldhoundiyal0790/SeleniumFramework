package base;

import com.mypages.BasePage;
import com.mypages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;
    public Page page;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) {
        if(browser.equals("chrome")){
            driver  = new ChromeDriver();
        }else if(browser.equals("firefox")){
            driver  = new FirefoxDriver();
        }else {
            System.out.println("no browser mentioned in testng");
        }
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        page = new BasePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

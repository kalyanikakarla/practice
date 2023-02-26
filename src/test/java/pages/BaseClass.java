package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
    public WebDriver driver;
    @BeforeSuite
    public  void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @BeforeClass
    public void seturl()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}

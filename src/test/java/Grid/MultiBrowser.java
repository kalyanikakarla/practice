package Grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class MultiBrowser {
    public WebDriver driver;
    DesiredCapabilities desiredCapabilities;
    @Parameters({"Browser"})
    @BeforeTest
    public void GridSetUp(String browser)
    {
        switch (browser)
        {
            case "chrome":
                desiredCapabilities=new DesiredCapabilities();
                ChromeOptions chromeOptions=new ChromeOptions();
                desiredCapabilities.setCapability("browsername","chrome");
                chromeOptions.merge(desiredCapabilities);
                driver=new ChromeDriver();
                driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
                try{
                    driver=new RemoteWebDriver(new URL("http://192.168.251.84:4444"),chromeOptions);
                }
                catch(MalformedURLException e)
                {
                    e.printStackTrace();
                }
                break;
            case "edge":
                desiredCapabilities=new DesiredCapabilities();
                EdgeOptions edge=new EdgeOptions();
                desiredCapabilities.setCapability("browsername","MicrosoftEdge");
                edge.merge(desiredCapabilities);
                driver=new EdgeDriver();
                driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
                try{
                    driver=new RemoteWebDriver(new URL(" http://192.168.251.84:4444"),edge);
                }
                catch(MalformedURLException ee)
                {
                    ee.printStackTrace();
                }

        }


    }

}

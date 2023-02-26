package pages;

import Actions.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login {
    WebDriver driver;
    String label;
    SeleniumActions actions;
    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
        actions=new SeleniumActions(driver);
    }
    @FindBy(xpath = "//input[@name='username']")
    WebElement userInputBox;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordInputBox;
    public void loginPage()
    {
//String label=driver.findElement(By.xpath("//label[text()='Username']")).getText();
        actions.enterValue(userInputBox,"Admin");
        actions.enterValue(passwordInputBox,"admin123");

    }
}

package Actions;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class SeleniumActions {
    WebDriver driver;
    Waits w;
    public SeleniumActions(WebDriver driver)
    {
        this.driver=driver;
        w=new Waits(driver);
    }
public boolean clickOnWebElementByUsingText(String tag,String text) {
    try {
        driver.findElement(By.xpath("//" + tag + "[text()=" + text + "")).click();
        return true;
    } catch (Exception e) {
        return false;
    }
}
public boolean clickOnWebElement(WebElement element) {
    boolean flag = false;
    try {
        element.click();
        flag = true;
    } catch (NoSuchElementException nse) {
        System.out.println(nse.toString());
        flag = false;

    } catch (StaleElementReferenceException ser) {
        System.out.println(ser.toString());
        flag = false;
    } catch (ElementClickInterceptedException eci) {
        System.out.println(eci.toString());
        flag = false;
    }
    return flag;
}
    public boolean selectValueFromDropDown(WebElement element,String data,String type) {
        Select se = new Select(element);
        try {
            switch (type) {
                case "index":
                    se.selectByIndex(Integer.parseInt(data));
                    break;
                case "value":
                    se.selectByValue(data);
                    break;
                case "visibletext":
                    se.selectByVisibleText(data);
                    break;
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;

        }
    }
    public boolean enterValue(WebElement element,String data)
    {
        try {
            element.sendKeys(data);
            return true;
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            return false;
        }

    }
    public void waitAndClickOnElement(WebElement  element)
    {
        w.waitClick(element);

    }



}

package Test;

import Grid.MultiBrowser;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.Login;

public class TestClass extends BaseClass {
    public Login login;
    public MultiBrowser multiBrowser;
    @BeforeClass
    public void initialization()
    {
        login=new Login(driver);
    }
    @Test
    public void allMethods()
    {
//login.loginPage();
multiBrowser.GridSetUp("edge");


    }

}

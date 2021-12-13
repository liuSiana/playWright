package tests;

import com.microsoft.playwright.Page;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

/**
 * @author liuxinai
 * @create 2021-12-11 12:41 下午
 */

public class LoginTester extends BaseTest {
    public static Page page;
    public static HomePage homePage=new HomePage(page);
    public static LoginPage loginPage=new LoginPage(page);


    @Test
    public void invailidUserName(){
        homePage.clickLoginButton();
        loginPage.login("111","liuxinai1989");
    }
}

package pages;

import com.microsoft.playwright.Page;
import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * @author liuxinai
 * @create 2021-12-11 1:42 下午
 */
public class HomePage extends BasePage {
    public HomePage(Page page){
        super(page);
    }
    //element
    String loginButton="text=你好，请登录";
    String userLoginSheet="xpath=/html/body/div[2]/div[2]/div[1]/div/div[3]/a";

    //Action
    public void clickLoginButton(){
        pwClick(loginButton);
        pwClick(userLoginSheet);
    }

}

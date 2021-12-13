package pages;

import com.microsoft.playwright.Page;

/**
 * @author liuxinai
 * @create 2021-12-11 1:42 下午
 */
public class LoginPage extends BasePage{
    public LoginPage(Page page){
        super(page);
    }

    //element
    String userNameInput="id=loginname";
    String passWordInput="id=nloginpwd";
    String loginButton="id=loginsubmit";

    //action
    public void login(String userName,String passWord){
       pFill(userNameInput,userName);
       pFill(passWordInput,passWord);
        pwClick(loginButton);
    }
}

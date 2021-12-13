package pages;

import com.microsoft.playwright.*;
import com.sun.xml.internal.ws.policy.PolicyIntersector;
import org.testng.annotations.BeforeTest;

/**
 * @author liuxinai
 * @create 2021-12-11 12:05 下午
 */
public class BasePage {
    public Page page;
    public BasePage(Page page){
        this.page=page;
    }
    public void pwClick(String clickElement){
        System.out.println("进入点击方法");
        page.click(clickElement);
    }
    public void pFill(String element,String text){
        System.out.println("进入输入方法");
        page.fill(element,text);
    }

}

package org.example;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import org.testng.annotations.Test;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();

            // Open new page
            Page page = context.newPage();

            // Go to https://www.wikipedia.org/
            page.navigate("https://www.jd.com/");
            String loginText="text=你好，请登录";
            page.click(loginText);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            page.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[3]/a");
            page.fill("id=loginname","18210342582");
            page.fill("id=nloginpwd","liuxinai1989");
            page.click("id=loginsubmit");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*// Click text=中文
            page.fill("id=kw","刘新爱");
            page.press("id=su","Enter");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/


        }
    }
    @Test
    public void f() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            // Open new page
            Page page = context.newPage();
            page.navigate("https://www.jd.com/");
            // Click text=你好，请登录

            page.click("text=你好，请登录");
            // assert page.url().equals("https://passport.jd.com/new/login.aspx?ReturnUrl=https%3A%2F%2Fwww.jd.com%2F");
            // Click text=账户登录
//            page.click("text=账户登录");
            page.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[3]/a");
            // Click [placeholder="邮箱/用户名/登录手机"]
            page.click("[placeholder=\"邮箱/用户名/登录手机\"]");
            // Fill [placeholder="邮箱/用户名/登录手机"]
            page.fill("[placeholder=\"邮箱/用户名/登录手机\"]", "18210342582");
            // Press Tab
            page.press("[placeholder=\"邮箱/用户名/登录手机\"]", "Tab");
            // Fill [placeholder="密码"]
            page.fill("[placeholder=\"密码\"]", "liuxinai1989");
            // Click text=登 录
            page.click("text=登 录");
        }
    }
}
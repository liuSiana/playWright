package tests;

import com.microsoft.playwright.*;
import org.testng.annotations.BeforeTest;

/**
 * @author liuxinai
 * @create 2021-12-11 2:01 下午
 */
public class BaseTest {
    public Page page;
    @BeforeTest
    public void setUp(){
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            // Open new page
            page = context.newPage();
            // Go to https://www.wikipedia.org/
            page.navigate("https://www.jd.com/");
        }
    }
}

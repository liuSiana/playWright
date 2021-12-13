package org.example;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class WebKitScreenshot {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
//            Browser browser = playwright.webkit().launch();
            Browser browserType = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
//            Page page = browserType.newPage();
//            Browser browser = browserType.launch();
            BrowserContext context = browserType.newContext();

// Start tracing before creating / navigating a page.
            context.tracing().start(new Tracing.StartOptions()
                    .setScreenshots(true)
                    .setSnapshots(true));

            Page page = context.newPage();
            page.navigate("https://butter365.com/");

// Stop tracing and export it into a zip archive.
            context.tracing().stop(new Tracing.StopOptions()
                    .setPath(Paths.get("trace.zip")));
            /*page.navigate("https://butter365.com/");
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));*/
        }

    }
}
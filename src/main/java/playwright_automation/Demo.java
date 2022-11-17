package playwright_automation;

import java.nio.file.Paths;

import com.microsoft.playwright.*;


public class Demo {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
		Page page = browser.newPage();
		page.navigate("https://www.google.com/");
		System.out.println(page.title() );
		page.type("input[name='q']", "Headphones");
		page.click("//input[@class='gNO89b']");
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
		browser.close();
		playwright.close();
	}

}

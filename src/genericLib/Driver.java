package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver dvr;

	String applicationUrl = "Z:\\FrameWorkUnderstanding\\LoginApp\\resources\\chromedriver.exe";

	public static void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "applicationUrl");
		dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		dvr.manage().window().maximize();
	}

}

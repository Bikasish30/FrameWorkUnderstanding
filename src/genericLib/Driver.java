package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver dvr;

	private static String chromeDriver = "Z:\\FrameWorkUnderstanding\\LoginApp\\resources\\chromedriver.exe";

	public static void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", chromeDriver);
		dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		dvr.manage().window().maximize();
	}

}

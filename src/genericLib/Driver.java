package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver dvr;

	public static void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"Z:\\Eclipse Neon 11-08-2016\\EclipseNeonWorkSpace\\LoginApp\\resources\\chromedriver.exe");
		dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		dvr.manage().window().maximize();
	}

}

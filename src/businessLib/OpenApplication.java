package businessLib;

import org.testng.Assert;

import genericLib.Driver;

public class OpenApplication {

	String url = "http://kassandra.immidart.com/immidartlite/";
	
	public void openApplication(String url){
		Driver.dvr.get(url);		
		String actualUrl = Driver.dvr.getCurrentUrl();
		Assert.assertEquals(actualUrl, url, "Invalid URL");
	}
}

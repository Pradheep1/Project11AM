package org.tsc;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.Base.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void before() throws Exception {
	BrowserLaunch();
	loadurl("https://adactin.com/HotelApp/");
}
	@After
	public void afters(Scenario sc) {
if (sc.isFailed()) {
	TakesScreenshot tk =(TakesScreenshot)driver;
byte[] a = tk.getScreenshotAs(OutputType.BYTES);
System.out.println(a);
sc.embed(a,"image/png");
}
	}
}



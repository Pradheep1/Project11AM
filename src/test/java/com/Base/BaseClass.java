package com.Base;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public	static WebDriver driver;

	public static void BrowserLaunch() throws IOException {
		WebDriverManager.chromedriver().version("80").setup();
		driver = new ChromeDriver();
	}

	public static void loadurl(String s) throws IOException {
		driver.get(s);
	}

	public static void FillRegister(WebElement e, String n) throws IOException {
		e.clear();
		e.sendKeys(n);
	}

	public static void Login(WebElement e) throws IOException {
		e.click();
	}

	public static void quitBrowser() {
		driver.quit();
	}
	public static void selectByText(WebElement e, String text) {
		Select s = new Select(e);
		s.selectByVisibleText(text);
	}

}

package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	
	public static WebDriver driver;
	
	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\eclipse-workspace\\AdactinProject\\src\\test\\resource\\org\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;
	}
	
	

}

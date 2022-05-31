package org.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	public static ThreadLocal <WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	public WebDriver init_driver (String brouserName) {
		String path= System.getProperty("user.dir");
		
		if (brouserName.equalsIgnoreCase("Chrome")||brouserName.equalsIgnoreCase("Ch")) {
			System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
			tlDriver.set(new ChromeDriver());
			
			}else if (brouserName.equalsIgnoreCase("firefox")||brouserName.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
			tlDriver.set(new FirefoxDriver());
			}
		getDriver().manage().deleteAllCookies();
		tlDriver.get().manage().window().maximize();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return getDriver();
	}
	public static synchronized WebDriver getDriver() {
	   
		return tlDriver.get() ;
		
	}
}

package org.utilities;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtility {
	public static BaseUtility bu = new BaseUtility();
	public WebDriver startup  (String url,String brouserName) {
		String path = System.getProperty("user.dir");
	
		WebDriver driver = null;
		if (brouserName.equalsIgnoreCase("Chrome")||brouserName.equalsIgnoreCase("ch")) {
		System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(); 
		}else if (brouserName.equalsIgnoreCase("firefox")||brouserName.equalsIgnoreCase("ff")) {
		System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
	//	driver.manage().window().minimize();
		driver.get(url);
		return driver;
	}
//	public WebDriver startupUsingWb (String url,String brouserName) {
//		String path = System.getProperty("user.dir");
//	
//		WebDriver driver = null;
//		if (brouserName.equalsIgnoreCase("Chrome")||brouserName.equalsIgnoreCase("ch")) {
////			WebDriverManager.chromedriver().setup(); 
//		System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
////		driver = new ChromeDriver(); 
//		}else if (brouserName.equalsIgnoreCase("firefox")||brouserName.equalsIgnoreCase("ff")) {
//		System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
////		WebDriverManager.firefoxdriver().setup();
////		driver= new FirefoxDriver();
//		}
////		driver.manage().window().maximize();
//	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
//	//	driver.manage().window().setSize(new Dimension(200,200));
//	//	driver.manage().window().minimize();
////		driver.get(url);
//		return driver;
//	}
	
	public void closeAdPopup(WebDriver driver) {
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		}
	public boolean isAlertPresent(WebDriver driver, int time) {
		try{
			WebDriverWait wt= new WebDriverWait(driver,Duration.ofSeconds(time));
			wt.until(ExpectedConditions.alertIsPresent());
			return true;
		}catch(Exception e) {
			return false;
		}

		}
	public void scrollTilElement(WebElement ele, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
	public void clickBuJS(WebElement ele, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
}



package org.pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	private WebDriver driver;
	// 1.Private WebElement
//	private WebElement userName= driver.findElement(By.id(""));

	@FindBy(xpath = "//a[contains(@class,'content')]")
	private List<WebElement> TaskTabList;

	@FindBy(id = "logoutLink")
	private WebElement LogoutBtn;

	// 2.Constsructor
	public DashboardPage(WebDriver driver) {
		// PageFactory.initElements(driver, DashboardPage.class);
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// 3.Page Action Method
	public boolean isFourTabsAreDisplayed() {
		if (TaskTabList.size() == 4) {
			System.out.println("Four Tabs are Displayed");
			return true;
		} else {
			return false;
		}
	}

	public void doLogout() {
		LogoutBtn.click();
	}
}

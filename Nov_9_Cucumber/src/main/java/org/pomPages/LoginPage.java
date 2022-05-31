package org.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	//1.Private WebElement
//	private WebElement userName= driver.findElement(By.id(""));
	
	@FindBy(id="username")
	private WebElement uNTxtField;
	
	@FindBy(css="input[name='pwd']")
	private WebElement pwdTxtField;
	
	@FindBy(css="#loginButton>div")
	private WebElement logibBtn;

	
	//2.Constsructor
	public LoginPage (WebDriver driver) {
//		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	//3.Page Action Method
	public boolean isUserNameFieldDisplayed() {
//		boolean flag= uNTxtField.isDisplayed();
//		return flag;
		return uNTxtField.isDisplayed();
	}
		
		public boolean isPasswordFieldDisplayed() {
//			boolean flag= pwdTxtField.isDisplayed();
//			return flag;
			return pwdTxtField.isDisplayed();

	}
		public boolean isLoginBtnFieldDisplayed() {
//			boolean flag= logibBtn.isDisplayed();
//			return flag;
			return logibBtn.isDisplayed();
		}
		public void enterUserName(String uName) {
			uNTxtField.sendKeys(uName);
		//	uNTxtField.sendKeys("admin");
		}
		public void enterPassWord(String pwd) {
			pwdTxtField.sendKeys(pwd);
		//	pwdTxtField.sendKeys("manager");
		}
		public void clickLoginButton() {
			logibBtn.click();
		}
		public void doLogin(String uName,String pwd) {   //collab 3 Action Methods
			uNTxtField.sendKeys(uName);
			pwdTxtField.sendKeys(pwd);
			logibBtn.click();

		}
		
} 

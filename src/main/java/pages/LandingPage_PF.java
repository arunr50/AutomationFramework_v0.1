package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseUtil.BaseClass;

public class LandingPage_PF extends BaseClass{

	@FindBy(name = "username")
	WebElement txt_username;

	@FindBy(name = "password")
	WebElement txt_password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	
	public LandingPage_PF() {
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String uname) {
		txt_username.sendKeys(uname);
	}

	public void enterPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}

	public void clickLogin() {
		loginBtn.click();
	}

}

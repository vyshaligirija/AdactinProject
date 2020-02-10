package org.pageobjectmodel;

import org.baseclass.FunctionalLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage extends FunctionalLibrary{
	@FindBy(id="username")
	private WebElement	username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginBtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public AdactinLoginPage() {
		PageFactory.initElements(driver, this);
	}

}

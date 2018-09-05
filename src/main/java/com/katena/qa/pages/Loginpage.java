package com.katena.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.katena.qa.base.TestBase;

public class Loginpage extends TestBase{

	//@FindBy(xpath=".//*[@id='email']")
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='pass']")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='send2']")
	WebElement loginbtn;
	
	public String accountpage;
		
	public Loginpage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public Homepage login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		accountpage = driver.getTitle();
		return new Homepage();
	}
}
	


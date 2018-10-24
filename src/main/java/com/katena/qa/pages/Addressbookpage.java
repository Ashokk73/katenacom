package com.katena.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.katena.qa.base.TestBase;

public class Addressbookpage extends TestBase {
	
	@FindBy(xpath="//span[text()='Address Book']")
	WebElement bannertext;
	
	public Addressbookpage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String Bannertext() 
	{
		return bannertext.getText();
	}

}

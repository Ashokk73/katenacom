package com.katena.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.katena.qa.base.TestBase;

public class Newsletterpage extends TestBase {
	
	@FindBy(xpath="html/body/div[1]/div/h1/span")
	WebElement bannertext;

	@FindBy(xpath=".//input[@type='checkbox']")
	WebElement newslettercheckbox;
	
	@FindBy(xpath=".//*[@id='form-validate']/div/div[1]/button")
	WebElement savecta;
	
	public Newsletterpage() 
	{
		PageFactory.initElements(driver, this);
	}
	public String Bannertile() 
	{
		return bannertext.getText();
	}
	
public void Checkboxselected() 
{
	if(newslettercheckbox.isSelected())
	{
		newslettercheckbox.click();
		savecta.click();
	}
	else
	{
		savecta.click();
	}
	
}
	
//public void Checkboxnotselected() 
//{
//	if(newslettercheckbox.isSelected())
//	{
//		newslettercheckbox.click();
//		savecta.click();
//	}
//}
}

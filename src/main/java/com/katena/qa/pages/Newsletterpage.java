package com.katena.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.katena.qa.base.TestBase;
import com.katena.qa.util.TestUtil;

public class Newsletterpage extends TestBase {
	
	@FindBy(xpath="html/body/div[1]/div/h1/span")
	WebElement bannertext;

	@FindBy(xpath=".//*[@id='form-validate']/fieldset/div/label/span")
	WebElement newslettercheckbox;
	
	@FindBy(xpath=".//*[@id='form-validate']/div/div[1]/button")
	WebElement savecta;
	
	@FindBy(xpath=".//*[@id='maincontent']/div[4]/div[2]/div/div/div")
	WebElement popupmsg;
	
	@FindBy(xpath=".//*[@id='maincontent']/div[4]/div[2]/div/div")
	WebElement unsubpopupmsg;
	
	public Newsletterpage() 
	{
		PageFactory.initElements(driver, this);
	}
	public String Bannertile() 
	{
		return bannertext.getText();
	}
	
	public void Checkbox() 
	{
		newslettercheckbox.click();
	}
	
	public void Savecta()
	{
		savecta.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time, TimeUnit.SECONDS);
	}
	
	public String Alertmsg() 
	{
		return popupmsg.getText();
	}
	public String Alertunsubmsg() 
	{
		return unsubpopupmsg.getText();
	}
}

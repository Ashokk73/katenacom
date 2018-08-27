package com.katena.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.katena.qa.base.TestBase;

public class Homepage extends TestBase {
	//BannerText
	@FindBy(xpath="html/body/div[1]/div/h1/span")
	WebElement bannertext;
	
	//Account Information - Contact Information
	@FindBy(xpath=".//*[@id='maincontent']/div[5]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]")
	WebElement editcontactbtn;
	
	@FindBy(xpath=".//*[@id='maincontent']/div[5]/div[1]/div[2]/div[2]/div[1]/div[2]/a[2]")
	WebElement changepwdbtn;
	
	@FindBy(xpath=".//*[@id='maincontent']/div[5]/div[1]/div[2]/div[2]/div[2]/div[2]/a")
	WebElement editnewsletterbtn;
	
	//Address Book
	@FindBy(xpath=".//*[@id='maincontent']/div[5]/div[1]/div[2]/div[2]/div[1]/div[2]/a[2]")
	WebElement manageaddressbtn;
	
	//LHS Navigation Link
	@FindBy(xpath=".//*[@id='account-nav']/ul/li[2]/a")
	WebElement myorders;
	
	@FindBy(xpath=".//*[@id='account-nav']/ul/li[4]/a")
	WebElement addressbook;
	
	@FindBy(xpath=".//*[@id='account-nav']/ul/li[5]/a")
	WebElement accountinformation;
	
	@FindBy(xpath=".//*[@id='account-nav']/ul/li[7]/a")
	WebElement newslettersubscription;
	
	@FindBy(xpath=".//*[@id='account-nav']/ul/li[8]/a")
	WebElement myreturns;
	
	@FindBy(xpath=".//*[@id='account-nav']/ul/li[9]/a")
	WebElement repairhistory;
	
	@FindBy(xpath=".//*[@id='account-nav']/ul/li[10]/a")
	WebElement myquotes;
	
	public Homepage(){
		PageFactory.initElements(driver, this);
	}
	
	public String Bannertitle() 
	{
		return bannertext.getText();
	}
	public String Editcontactinformationbtn() {
		editcontactbtn.click();
		return driver.getTitle();
	}
	
	public String Changepasswordbutton() {
		changepwdbtn.click();
		return driver.getTitle();
	}
	
	public String Editnewsletterbtn() {
		editnewsletterbtn.click();
		return driver.getTitle();
	}
	
	public String Myorders() {
		myorders.click();
		return driver.getTitle();
	}
	
	public String Addressbook() {
		addressbook.click();
		return driver.getTitle();
	}
	
	public String Accountinformation() {
		accountinformation.click();
		return driver.getTitle();
	}
	
	public Newsletterpage Newslettersubscription() {
		newslettersubscription.click();
		return new Newsletterpage();
	}
	
	public String Myreturns() {
		myreturns.click();
		return driver.getTitle();
	}
	
	public String Repairhistory() {
		repairhistory.click();
		return driver.getTitle();
	}
	
	public String MyQuotes() {
		myquotes.click();
		return driver.getTitle();
	}
}

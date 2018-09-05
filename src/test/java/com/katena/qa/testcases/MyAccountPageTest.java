package com.katena.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.katena.qa.base.TestBase;
import com.katena.qa.pages.Homepage;
import com.katena.qa.pages.Loginpage;
import com.katena.qa.pages.Newsletterpage;
import com.katena.qa.util.TestUtil;

public class MyAccountPageTest extends TestBase {
	
	Loginpage loginpage;
	Homepage homepage;
	TestUtil testutil;
	
	public MyAccountPageTest() 
	{
		super();		
	}
	
	@BeforeMethod()
	public void Setup() 
	{
		initialization();
		testutil = new TestUtil();
		loginpage = new Loginpage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("We are in My Account Page");
	}
	
	@Test(priority=1)
	public void BannerTextValidateTest() 
	{
		String bannertitle = homepage.Bannertitle();
		Assert.assertEquals(bannertitle, "My Account");
	}
	@Test(priority=2)
	public void MyreturnsTest() {
		String Myreturnspagetitle = homepage.Myreturns();
		Assert.assertEquals(Myreturnspagetitle, "My Orders");
	}
	
	@Test(priority=3)
	public void RepairhistoryTest() {
		String Repairhstrypagetitle = homepage.Repairhistory();
		Assert.assertEquals(Repairhstrypagetitle, "My Orders");
	}
	
	@Test(priority=4)
	public void MyQuotesTest() {
	String myquotes = homepage.MyQuotes();
		Assert.assertEquals(myquotes, "My Quotes");
	}
	
	@Test(priority=5)
	public void MyordersTest() {
		String Myorderspagetitle = homepage.Myorders();
		Assert.assertEquals(Myorderspagetitle, "My Orders");
	}
	
	@Test(priority=6)
	public void AddressbookTest() {
		String Addressbookpagetitle = homepage.Addressbook();
		Assert.assertEquals(Addressbookpagetitle, "Address Book");
	}
	
	@Test(priority=7)
	public void AccountinformationTest() {
		String Accountinfopagetitle = homepage.Accountinformation();
		Assert.assertEquals(Accountinfopagetitle, "Account Information");
	}
	
	@Test(priority=8)
	public void NewslettersubscriptionTest() {
		Newsletterpage Newsltrsubspagetitle = homepage.Newslettersubscription();
		Assert.assertEquals(Newsltrsubspagetitle, "Newsletter Subscription");
	}
	
	@Test(priority=9)
	public void EditcontactinformationbtnTest() {
		String Editcontactinfobtn = homepage.Editcontactinformationbtn();
		Assert.assertEquals(Editcontactinfobtn, "Account Information");
	}
	
	@Test(priority=10)
	public void ChangepasswordbtnTest() {
		String Changepwdpagetitle = homepage.Changepasswordbutton();
		Assert.assertEquals(Changepwdpagetitle, "Account Information");
	}
	
	@Test(priority=11)
	public void EditnewsletterbtnTest() {
		String Editnewsltrbtn = homepage.Editnewsletterbtn();
		Assert.assertEquals(Editnewsltrbtn, "Newsletter Subscription");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	}

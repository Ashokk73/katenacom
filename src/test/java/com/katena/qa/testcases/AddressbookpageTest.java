package com.katena.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.katena.qa.base.TestBase;
import com.katena.qa.pages.Addressbookpage;
import com.katena.qa.pages.Homepage;
import com.katena.qa.pages.Loginpage;
import com.katena.qa.util.TestUtil;

public class AddressbookpageTest extends TestBase {
	
	Loginpage loginpage;
	Homepage homepage;
	TestUtil testutil;
	Addressbookpage addressbookpage;
	
	public AddressbookpageTest() {
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
    
	@Test
	public void Verifypagetitletest()
	{
		String addresbookpagetitle = homepage.Addressbook();
		System.out.println("Page title is "+ addresbookpagetitle);
		Assert.assertEquals("Address Book", addresbookpagetitle);
	}
	
	@Test
	public void Verifypagebannertest() throws InterruptedException 
	{
		addressbookpage = new Addressbookpage();
		homepage.Addressbook();
		String bannertext = addressbookpage.Bannertext();
		Assert.assertEquals("Address Book", bannertext);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}

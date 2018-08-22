package com.katena.qa.testcases;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.katena.qa.base.TestBase;
import com.katena.qa.pages.Homepage;
import com.katena.qa.pages.Loginpage;
import com.katena.qa.pages.Newsletterpage;
import com.katena.qa.util.TestUtil;

public class NewsletterpageTest extends TestBase{
	
	Loginpage loginpage;
	Homepage homepage;
	Newsletterpage newsletterpage;
	TestUtil testutil;
	
	public NewsletterpageTest() 
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
	}
	
//	@Test
//	public void ClickonNewletterTest()
//	{
//		homepage.Newslettersubscription();
//	}
//	
//	@Test
//	public void BannerTextValidateTest() 
//	{
//		homepage.Newslettersubscription();
//		String bannertitle = homepage.Bannertile();
//		Assert.assertEquals(bannertitle, "Newsletter Subscription");
//	}
	
	@Test
	public void CheckboxselectedTest() 
	{
		homepage.Newslettersubscription();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time, TimeUnit.SECONDS);
		newsletterpage.Checkboxselected();
	}
	
//	@Test
//	public void CheckboxnotselectedTest() 
//	{
//		homepage.Newslettersubscription();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time, TimeUnit.SECONDS);
//		newsletterpage.Checkboxnotselected();
//	}
//	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
	
}

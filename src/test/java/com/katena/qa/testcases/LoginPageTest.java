package com.katena.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.katena.qa.base.TestBase;
import com.katena.qa.pages.Homepage;
import com.katena.qa.pages.Loginpage;
import com.katena.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	
	Loginpage loginpage;
	Homepage homepage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() 
	{
		initialization();
		loginpage = new Loginpage();
	}
	
	@Test(priority=1)
	public void loginpagetitleTest()
	{
		String Loginpagetitle = loginpage.validateLoginPageTitle();
		Assert.assertEquals(Loginpagetitle, "Customer Login");
	}
	
	@Test(priority=2)
	public void loginpagevalidateTest()
	{
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time, TimeUnit.SECONDS);
		Assert.assertEquals(loginpage.accountpage, "My Account");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}

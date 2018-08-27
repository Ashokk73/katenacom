package com.katena.qa.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.katena.qa.util.TestUtil;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream FI = new FileInputStream("D:\\Selenium-Projects\\POM-Framework\\katenacom\\src\\main\\java\\com\\katena\\qa\\config\\config.properties");
//					.getProperty("User.dir")+"/katenaecom/src/main/java/com/katena/qa/config/config.properties");
			prop.load(FI);
		} catch(FileNotFoundException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}}
	
	public static void initialization() 
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Ashok-Data\\Ashok\\Data\\Testing\\chromedriver_win32-1\\chromedriver.exe");
//					"D:\\Ashok-Data\\Ashok\\Data\\Testing\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.firefox.marionette", "D:\\Ashok-Data\\Ashok\\Data\\Testing\\Java Tutorial\\G\\Firefox\\geckodriver-v0.18.0-win64.exe");
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}

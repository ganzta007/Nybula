/**
 * 
 */
package com.nybula;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Sample {
	public WebDriver driver;
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Automation setup softwares\\chrome driver 104 version setup\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		
	}
	@Test
	public void method1() {
		String title = driver.getTitle();
		assertEquals(title, "Google");
		System.out.println("title matched and test case passed" + title);
	}
	@AfterSuite
	public void tearDown() {
		driver.close();
		
	}

}

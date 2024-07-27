package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class registrationTest1 {
	WebDriver driver;
@BeforeClass
public void launchBrowser()
{
	 driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
}
@Test
public void reg1()
{
	registrationPage p=new registrationPage(driver);
	p.clickGender();
	p.enterfname("supriya");
	p.enterlname();
	
	p.enterEmail("aa@gmmail.com");
	
}
@Test
public void reg2()
{
	registrationPage p=new registrationPage(driver);
	p.clickGender();
	p.enterfname("yamini");
	//p.enterlname();
	
	p.enterEmail("aa@gmmail.com");
	
}
@AfterClass()
public void teardown()
{
	driver.close();
}
}


package PFM;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegistrationTest {
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	RegistrationPage p=new RegistrationPage(driver);
	p.clickGender();
	p.enterfname("supriya");
	p.enterlname();
	
	p.enterEmail("aa@gmmail.com");
	
}
}

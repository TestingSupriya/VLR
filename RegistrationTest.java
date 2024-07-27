package POM;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegistrationTest {
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	registrationPage p=new registrationPage(driver);
	p.clickGender();
	p.enterfname("supriya");
	p.enterlname();
	
	p.enterEmail("aa@gmmail.com");
	
}
}

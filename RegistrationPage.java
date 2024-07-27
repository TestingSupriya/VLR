package PFM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	 /* By fgender=By.id("gender-female");
      By fname=By.name("FirstName");
      By lanme=By.id("LastName");
      By email=By.cssSelector("input#Email");*/
	@FindBy(how=How.ID,using="gender-female")
	WebElement fgender;
	@FindBy(how=How.NAME,using="FirstName")
	WebElement fname;
	@FindBy(how=How.ID,using="LastName")
	WebElement lname;
	@FindBy(how=How.CSS,using="input#Email")
	WebElement email;
	RegistrationPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	 public void clickGender()
     {
   	  fgender.click();
     }
     public void enterfname(String ffname)
     {
   	 fname.sendKeys(ffname);
     }
     public void enterlname()
     {
   	 lname.sendKeys("yamini");
     }
     public void enterEmail(String eemail)
     {
   	  email.sendKeys(eemail);
     }
   
}

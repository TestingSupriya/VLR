package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationPage {
WebDriver driver;
          By fgender=By.id("gender-female");
          By fname=By.name("FirstName");
          By lanme=By.id("LastName");
          By email=By.cssSelector("input#Email");
          
          registrationPage(WebDriver driver)
          {
        	  this.driver=driver;
          }
          
          public void clickGender()
          {
        	  driver.findElement(fgender).click();
          }
          public void enterfname(String ffname)
          {
        	  driver.findElement(fname).sendKeys(ffname);
          }
          public void enterlname()
          {
        	  driver.findElement(lanme).sendKeys("yamini");
          }
          public void enterEmail(String eemail)
          {
        	  driver.findElement(email).sendKeys(eemail);
          }
          
}

package tm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tm.qa.testbase.BaseClass1;

public class SignInPage extends BaseClass1
{
    //OR
 @FindBy(name="email")	
 WebElement Email;

 @FindBy(name="password")
 WebElement Password;

 @FindBy(xpath="//*[@id=\"hideDiv\"]/div[4]/button")
 WebElement LoginBtn;
      
//constructor
  public SignInPage()
  {
	PageFactory.initElements(driver, this);
  }
	//actions
       public void validEmail(String un)
       {
	   Email.sendKeys(un);
       }
	   public void validpassword(String psw)
	   {
	   Password.sendKeys(psw); 	   
	   }
	   public void clickOnLogin()
	   {
	   LoginBtn.click();
	   }
	
}

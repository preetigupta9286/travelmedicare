package tm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tm.qa.testbase.BaseClass1;

public class SignUpPage extends BaseClass1
{
//OR
   @FindBy(name="first_name")
   WebElement FirstName;

   @FindBy(name="last_name")
   WebElement LastName;

   @FindBy(name="email")
   WebElement EmailforSignUp;
   
   @FindBy(name="password")
   WebElement VPassword;
   
   @FindBy(name="password_confirmation")
   WebElement ConfVPassword;
   
   @FindBy(xpath="//input[@class='btn-consition']")
   WebElement checkAgree;
   
   @FindBy(xpath="//button[contains(text(),'Sign up')]")
   WebElement SignUpbtn ;
   
//constructor
   public SignUpPage()
    {
	  PageFactory.initElements(driver, this);
    }
   
//actions
  
      public UserProfilePage validSignUpData(String FN,String LN,String EM,String vpswd,String cpswd)
        {
    	  FirstName.sendKeys(FN);
    	  LastName.sendKeys(LN);
          EmailforSignUp.sendKeys(EM);
          VPassword.sendKeys(vpswd);
          ConfVPassword.sendKeys(cpswd); 
          checkAgree.click();
    	   SignUpbtn.click();
    	   return new UserProfilePage();
    	 
       }}

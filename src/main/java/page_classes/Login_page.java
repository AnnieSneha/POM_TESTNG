package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver driver;
	
	 public Login_page(WebDriver driver) {
		 
	 this.driver=driver;
		 
	 PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(id = "loginFrm_loginname")
	 
	 private WebElement login_email;
	 
     @FindBy(id="loginFrm_password")
     
     private WebElement login_pass;
     
     @FindBy(linkText = "Forgot password?")
     
     private WebElement forgot_password;
     
@FindBy(linkText ="Forgot your login?" )
     
     private WebElement login_forgot;
     
     
     @FindBy(css = "button[title='Login']")
     
     private WebElement login_submit;
     
     @FindBy(css="[title=\"Continue\"]")
     private WebElement continue_button;
     
     public WebDriver getDriver() {
	return driver;
}


public WebElement getLogin_email() {
	return login_email;
}

public WebElement getLogin_pass() {
	return login_pass;
}

public WebElement getForgot_password() {
	return forgot_password;
}





public WebElement getLogin_forgot() {
	return login_forgot;
}





public WebElement getLogin_submit() {
	return login_submit;
}





public WebElement getContinue_button() {
	return continue_button;
}





	public void Login(String username,String password) {
    	
    	login_email.sendKeys(username);
    	
    	login_pass.sendKeys(password);
    	
    	login_submit.click();
    }
     
     
     
    
     
}

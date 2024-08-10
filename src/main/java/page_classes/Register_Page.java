package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register_Page {
	
	WebDriver driver;
	
	Select s;
	
	public Register_Page(WebDriver driver) {
		
		this.driver=driver;
		 
		PageFactory.initElements(driver, this);
    }
	
	@FindBy(id="AccountFrm_firstname")
	
	private WebElement reg_fname;
	
	@FindBy(id="AccountFrm_lastname")
	
	private WebElement reg_lname;
	
	@FindBy(id="AccountFrm_email")
	
	private WebElement reg_email;
	
	
	@FindBy(id="AccountFrm_company")
	
    private WebElement reg_comapny;
	
	@FindBy(id="AccountFrm_country_id")
	
	private WebElement reg_address;
	
	@FindBy(id="AccountFrm_city")
    
	private WebElement reg_city;
	
	@FindBy(id="AccountFrm_country_id")
	
	private WebElement country_dropdown;
	
	@FindBy(id="AccountFrm_zone_id")
	
	private WebElement state_dropdown;
	
	@FindBy(id="AccountFrm_postcode")
	
	private WebElement post_code;
	
	@FindBy(id="AccountFrm_loginname")
	
	private WebElement reg_login;
	
	@FindBy(id="AccountFrm_password")
	
	private WebElement reg_pass;
	
	@FindBy(id="AccountFrm_confirm")
	
	private WebElement reg_passconfirm;
	
	@FindBy(id="AccountFrm_agree")
	
	private WebElement reg_tick;
	
	@FindBy(css = "[title='Continue']")
	
	private WebElement reg_continue;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getReg_fname() {
		return reg_fname;
	}

	public WebElement getReg_lname() {
		return reg_lname;
	}

	public WebElement getReg_email() {
		return reg_email;
	}


	public WebElement getReg_address() {
		return reg_address;
	}
	

	public WebElement getReg_city() {
		return reg_city;
	}



	public WebElement getCountry_dropdown() {
		return country_dropdown;
	}

	public WebElement getState_dropdown() {
		return state_dropdown;
	}

	public WebElement getPost_code() {
		return post_code;
	}

	public WebElement getReg_login() {
		return reg_login;
	}

	public WebElement getReg_pass() {
		return reg_pass;
	}

	public WebElement getReg_passconfirm() {
		return reg_passconfirm;
	}

	public WebElement getReg_tick() {
		return reg_tick;
	}

	public WebElement getReg_continue() {
		return reg_continue;
	}
	
	public void Register_Personal(String firstname,String lastname,String email) {
		
		reg_fname.sendKeys(firstname);
		reg_lname.sendKeys(lastname);
		reg_email.sendKeys(email);
		
		
	}
	
	public void Register_Address(String address,String city,String country,String state,String postcode) {
		
		reg_address.sendKeys(address);
		reg_city.sendKeys(city);
		s=new Select(this.country_dropdown);
		s.selectByVisibleText(country);
		s=new Select(this.state_dropdown);
		s.selectByVisibleText(state);
		post_code.sendKeys(postcode);
	}
	
	public void RegisterLogin(String loginreg,String passwordreg,String passwordconfirm ) {
		
		reg_login.sendKeys(loginreg);
		reg_pass.sendKeys(passwordreg);
		reg_passconfirm.sendKeys(passwordconfirm);
		reg_tick.click();
		reg_continue.click();
	}

	
}




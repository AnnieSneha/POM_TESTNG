package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import page_classes.Home_Page;
import page_classes.Login_page;
import page_classes.Register_Page;

public class FinalTest extends BaseTest{ //using extends
	
	//Login_page login;
	//the base class should be the parent class for all the test classes(Inheritance)
	//Home_Page home;
	
	//Register_Page reg;
	
	@Test
	
	public void logintest() {
		
		//we have to call the business methods that we written in the login
		//so we need to create the object
		
		home.getRegister_loginlink().click();
		login.Login(username, password);
		
	}
	
	@Test
	public void registertest() {
		login.getContinue_button().click();
		reg.Register_Personal(rfirstname, rlastname, remail);
		reg.Register_Address(raddress, rcity, rcountry, rstate, rpostcode);
		reg.RegisterLogin(rloginreg, rpasswordreg, rpasswordconfirm);
		
	}
	

}

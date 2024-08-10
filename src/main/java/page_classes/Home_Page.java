package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	//Step 1:We need to create the constructor of the class
	//Its a method which is same as the class name
	
	//we need create it globally
	WebDriver driver;
	
   public Home_Page(WebDriver driver) {//its coming from outside
		//we need to use the constructor to initialize the driver from base test
		
	   this.driver=driver;
	   //for calling the class variable to refer the global variable
	   
	   PageFactory.initElements(driver, this);
	   
   }
	   
	   //initElements is used to initialize all the weblements 
   
     //Using FindBy  and initialize using the webelements 
	   
	   @FindBy(linkText = "Login or register")
	   private WebElement register_loginlink;
	  
	   @FindBy(linkText = "Specials")
	   private WebElement speciallink;
	   
	   @FindBy(linkText ="Account")
	   private WebElement accountlink;
	   
	   @FindBy(linkText = "Shopping cart")
	   private WebElement shoppinglink;
	   
	   @FindBy(linkText = "Cart")
	   private WebElement cartlink;
	   
	   @FindBy(linkText = "Checkout")
	   private WebElement checkoutlink;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRegister_loginlink() {
		return register_loginlink;
	}

	public WebElement getSpeciallink() {
		return speciallink;
	}

	public WebElement getAccountlink() {
		return accountlink;
	}

	public WebElement getShoppinglink() {
		return shoppinglink;
	}

	public WebElement getCartlink() {
		return cartlink;
	}

	public WebElement getCheckoutlink() {
		return checkoutlink;
	}

	
	   
	   //right click=>click on source=>click on setters and getters ==>click on select getters and uncheck driver
	   
	   //getter methods for all the webelements

	
	   
	  

	
	   
	   
	   
	   
	   
	   
   
	
	

}

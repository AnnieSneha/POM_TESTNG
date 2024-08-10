package generics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import page_classes.Home_Page;
import page_classes.Login_page;
import page_classes.Register_Page;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	/* In this we have to create  only before class and after class
	 * property file:is an external file under src/test/resources
	 * 
	 * in the constructor I have to pass the properties
	 * 
	 * get property is the method to fetch the properties from the config.properties
	 */
	
	
	 protected WebDriver driver;
	 
	 String origin;
	 
	 protected String username;
	 
	 protected String password;
	 
	 protected String rfirstname;
	 
	 protected String rlastname;
	 
	 protected String remail;
	 
	 protected String raddress;
	 
	 protected String rcity;
	 
	 protected String rcountry;
	 
	 protected String rstate;
	 
	 protected String  rpostcode;
	 
	 protected String rloginreg;
	 
	 protected String rpasswordreg;
	 
	 protected String rpasswordconfirm;
	 
	protected Login_page login;
		//the base class should be the parent class for all the test classes(Inheritance)
	public Home_Page home;
	 
	protected Register_Page reg;
	 
	 
	  @BeforeClass
     
     public void setup() throws IOException {
    	 
    	 driver=new ChromeDriver();
    	 
    	 Properties pr=new Properties();//Create a property object for attracting data from config.properties
    	 
    	 FileInputStream fis= new FileInputStream("C:\\Users\\annie\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\POM_NOP\\src\\test\\resources\\config.properties");
    	
    	 pr.load(fis);//loads the  file in it
        
    	 origin = pr.getProperty("url");
    	 
    	 driver.get(origin);
    	 
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 
    	 driver.manage().window().maximize();
    	 
    	 home=new Home_Page(driver);
 		
 		 login=new Login_page(driver);
 		
 		 reg=new Register_Page(driver);
    	 
    	 username = pr.getProperty("username");
    	 
    	 password=pr.getProperty("password");
    	 
    	 //then we call it using the driver
    	 
    	 rfirstname=pr.getProperty("firstname");
    	 
    	 rlastname=pr.getProperty("lastname");
    	 
    	 remail=pr.getProperty("email");
    	 
    	 raddress=pr.getProperty("address");
    	 
    	 rcity= pr.getProperty("city");
    	 
    	 rstate=pr.getProperty("state");
    	 
    	 rcountry=pr.getProperty("country");
    	 
    	 rpostcode=pr.getProperty("postcode");
    	 
    	 rloginreg=pr.getProperty("loginreg");
    	 
    	 rpasswordreg=pr.getProperty("passwordreg");
    	 
    	 rpasswordconfirm=pr.getProperty("passwordconfirm");
    	  
     }
     
     @AfterClass
     
     public void teardown() {
    	 
    	 driver.close();
     }
}

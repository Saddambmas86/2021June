package shl.Testcases;

import org.testng.annotations.Test;

import shl.base.DriverInstance;
import shl.pages.LoginPage;

public class TC_OO1_Validate_Login_functionality extends DriverInstance {

	
@Test	
public void TC_001_Validate_Login_functionality() throws Exception{
LoginPage login=new LoginPage(driver);
login.userName("uname");
login.password("pass");
login.login();
}	
}

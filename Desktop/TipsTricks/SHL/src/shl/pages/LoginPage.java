package shl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import shl.Utility.Utility;

public class LoginPage {

WebDriver driver;	
public LoginPage(WebDriver driver){
this.driver=driver;
}
	
	
public void userName(String uname) throws Exception{
	
driver.findElement(By.id(Utility.fetchlocators("login_username_id"))).sendKeys(uname);		
}

public void password(String pass) throws Exception{
driver.findElement(By.id(Utility.fetchlocators("login_password_id"))).sendKeys(pass);
}

public void login() throws Exception{
	driver.findElement(By.id(Utility.fetchlocators("login_signon_id"))).click();
}
	
	
	
	
}

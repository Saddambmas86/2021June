package shl.assertion;

import org.openqa.selenium.WebDriver;

public class Compare {

	
public static boolean validateURL(WebDriver driver, String expURL){
	
boolean flag=false;
if(driver.getCurrentUrl().equalsIgnoreCase(expURL)){
	flag=true;
}
return flag;
}

public static boolean validatePageTitle(WebDriver driver, String expPageTitle){

	
boolean flag=false;	
if(driver.getTitle().equalsIgnoreCase(expPageTitle)){
	flag=true;
}
	return flag;
}





}

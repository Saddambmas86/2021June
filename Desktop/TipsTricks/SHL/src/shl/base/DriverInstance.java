package shl.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import shl.Utility.Utility;

public class DriverInstance {

public static WebDriver driver;	
	
	
@BeforeMethod	
public void inititateDriverInstance() throws Exception{

if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("chrome")){	
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
driver=new ChromeDriver();	
}	
else if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("firefox")){
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	driver=new FirefoxDriver();
}

else if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("ie")){
	System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
	driver=new InternetExplorerDriver();
}

else{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	driver=new ChromeDriver();
}

driver.get(Utility.fetchProperty("applicationURL").toString());
}
	
@AfterMethod
public void dropDriverInstance(){
	driver.quit();
}

public static void main(String...s) {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	driver=new ChromeDriver();	
	
	driver.get("https://www.facebook.com");
}

}

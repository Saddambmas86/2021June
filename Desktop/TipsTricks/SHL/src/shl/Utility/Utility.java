package shl.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Utility {

//To read data from config.property file	
public static Object fetchProperty(String key) throws Exception{
FileInputStream file=new FileInputStream("./config/config.property");
Properties property=new Properties();
property.load(file);
return property.get(key);
}
	

public static String fetchlocators(String key) throws Exception{
FileInputStream file=new FileInputStream("./config/Elements_Properties");
Properties property=new Properties();
property.load(file);
return property.get(key).toString();
}



}

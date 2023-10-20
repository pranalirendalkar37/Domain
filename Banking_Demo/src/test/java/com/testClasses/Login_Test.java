package com.testClasses;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.base.xpath.Login_Locators;

public class Login_Test extends BaseClass {
	
	@BeforeMethod
     public void setup () throws Exception
     {
     try {
    	 LaunchWebUrl();
    	 }catch(IOException e) {
    		 e.printStackTrace();
    	 }
     }
       @AfterMethod
       
       public void setuptearup() {
       driver.quit();
       
       }
       
       @Test
       public void LoginPage() {
    	   Login_Locators login=new  Login_Locators();
    	   login.setInputusername(login.getusername());
    	   login.setInputpassword(login.getpassword());
    	   login.getloginbutton();
    	   
       }
       
       
   
	
	
	

}

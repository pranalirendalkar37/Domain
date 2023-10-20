package com.base.xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class  Login_Locators extends BaseClass {
	
public  Login_Locators() {
	
	PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//p[text()='Username : Admin']")
	 private WebElement username;
	 
	 @FindBy(xpath="//p[text()='Password : admin123']")
	 private WebElement password;
	 
	 @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[1]")
	 private WebElement inputusername;
	 
	 @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	 private WebElement inputpassword;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 private WebElement loginbutton;
	 
	 @FindBy(xpath="//p[text()='Forgot your password? ']")
	 private WebElement forgotpassword;
	 
	 
	 public String getusername() {
		 String name =username.getText();
		 return
		 name.substring(name.indexOf(':'),name.length()-1);
		 
	 } 
	 public String getpassword() {
		 String pass =password.getText();
		 return
		 pass.substring(pass.indexOf(':'));
	 }
	 public void  getloginbutton() {
		loginbutton.click();
	 }

	  
	public void setInputusername(String inputusername) {
		String username =inputusername.toString();
	}
		
	public void setInputpassword(String inputpassword) {
			String username =inputpassword.toString();
			
	
			
				
		
	}
	 
	
		 
}


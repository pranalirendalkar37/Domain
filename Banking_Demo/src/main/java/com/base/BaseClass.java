package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static String projectpath=System.getProperty("user.dir");
	
	public static WebDriver driver;
	
	public void LaunchWebUrl() throws Exception {
		FileInputStream file=new FileInputStream(projectpath+"\\src\\test\\resources\\Properties\\com.config.properties");
		driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		Properties prop=new Properties();
		prop.load(file);
		prop.getProperty("webUrl");
		driver.get(prop.getProperty("webUrl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
	}

}

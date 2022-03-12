package com.sel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
	WebDriver driver; 
	
    public static void addLogin() {
		
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
   }
    public static void main(String[] args) {
		
   addLogin(); 
    	
    	} 



}
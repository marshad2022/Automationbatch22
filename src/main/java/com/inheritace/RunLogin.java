package com.inheritace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunLogin {
	
	
	public void getLogin() {
		
		System.setProperty("Webdriver.chrome.driver","./Driver/ChromeDriver_v98.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get(null);
	}
	
	
	public static void main(String[] args) {
		RunLogin obj =new RunLogin();
		obj.getLogin();
		
		
	}
	
	

}

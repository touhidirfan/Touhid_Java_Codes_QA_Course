package com.automation.Sep3_2023_Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstAutomationCode {
	
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver(); //Ctrl+Shift+O
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");
		driver.quit();
		
		WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.rediff.com");
		driver1.quit();
		
		WebDriver driver2=new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.flipcart.com");
		driver2.quit();
		
		
	}

}

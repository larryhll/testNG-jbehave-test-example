package com.lazycode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {
    private WebDriver driver = new FirefoxDriver();
    
	public void goTo() {
    	 driver.get("http://www.google.com");
     }
     
     public void searchKeyword(){
    	 driver.findElement(By.cssSelector("#lst-ib")).sendKeys("test");
    	 driver.findElement(By.cssSelector("#lst-ib")).sendKeys(Keys.ENTER);
     }
     
     public void quitDriver() {
    	 driver.close();
     }
}

package com.formevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Submitandclear {
       
    
   protected static String url="https://www.facebook.com/";
   WebDriver driver;

  @BeforeSuite
  public void startchromebrowser() {
  WebDriverManager.chromedriver().setup();
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  }

  @Test
  public void submitfacebook() throws InterruptedException {
  driver.get(url);
  WebElement email=driver.findElement(By.id("email"));
  email.sendKeys("rekha@gmail.com");
 
  WebElement password=driver.findElement(By.id("pass"));
  password.sendKeys("admin123");
 
  WebElement login=driver.findElement(By.name("login"));
  login.submit();
  Thread.sleep(3000);
  }
  
  @Test
  public void clearmethod() throws InterruptedException {
	  driver.get(url);
	  WebElement email=driver.findElement(By.id("email"));
	  email.clear();
	  email.sendKeys("bhanu@gmail.com");
	  Thread.sleep(3000);
	  email.clear();
	  Thread.sleep(3000);
  }

  @AfterSuite
  public void closechromebrowser() {
	  driver.quit();
  }

  
}

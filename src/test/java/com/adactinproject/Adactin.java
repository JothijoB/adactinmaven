package com.adactinproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","D:\\cucumber\\Maven\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.adactinhotelapp.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sham1992");
			
			driver.findElement(By.id("password")).sendKeys("CU3LVO");
			
			driver.findElement(By.id("login")).click();
			
			WebElement location  = driver.findElement(By.xpath("//select[@id='location']"));
			
			Select s=new Select(location);
			
			s.selectByVisibleText("Melbourne");
			
			 WebElement hotels = driver.findElement(By.id("hotels"));
			
			Select s1=new Select(hotels);
			
			//Thread.sleep(2000);
			
			s1.selectByValue("Hotel Sunshine");
			
			WebElement room = driver.findElement(By.id("room_type"));
			
			Select s2=new Select(room);
			
			s2.selectByVisibleText("Standard");
			
			WebElement rooms = driver.findElement(By.id("room_nos"));
			
			Select s3=new Select(rooms);
			
			s3.selectByVisibleText("2 - Two");
			
			WebElement datein = driver.findElement(By.id("datepick_in"));
			
			datein.clear();
			
			datein.sendKeys("20/12/2023");
			
			WebElement dateout = driver.findElement(By.id("datepick_out"));
			
			dateout.clear();
			
			dateout.sendKeys("22/12/2023");
			
			WebElement adultroom = driver.findElement(By.id("adult_room"));
			
			Select s4=new Select(adultroom);
			
			s4.selectByVisibleText("3 - Three");
			
			WebElement childroom = driver.findElement(By.id("child_room"));
			
			Select s5=new Select(childroom);
			
			s5.selectByVisibleText("1 - One");
			
			driver.findElement(By.id("Submit")).click();
			
			driver.findElement(By.id("radiobutton_0")).click();
			
			driver.findElement(By.id("continue")).click();
			
			driver.findElement(By.name("first_name")).sendKeys("Ragul");
			
			driver.findElement(By.name("last_name")).sendKeys("Sharma");
			
			driver.findElement(By.id("address")).sendKeys("chennai");
			
			driver.findElement(By.id("cc_num")).sendKeys("1265487654231456");
			
			WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
			
			Select sc=new Select(cardtype);
			
			sc.selectByVisibleText("VISA");
			
			WebElement expmonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
			
			Select sc1=new Select(expmonth);
			
			sc1.selectByVisibleText("January");
			
			WebElement expyear = driver.findElement(By.id("cc_exp_year"));
			
			Select sc2=new Select(expyear);
			
			sc2.selectByVisibleText("2014");
			
			driver.findElement(By.id("cc_cvv")).sendKeys("398");
			
			driver.findElement(By.id("book_now")).click();
			
			Thread.sleep(6000);
			
			//driver.findElement(By.name("last_name")).sendKeys("Sharma");
			
			driver.findElement(By.name("my_itinerary")).click();
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File sourse=ts.getScreenshotAs(OutputType.FILE);
			
			File desti=new File("D:\\cucumber\\Maven\\screenshot\\adactin.png");
			
			FileUtils.copyFile(sourse, desti);
			
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			
			driver.navigate().back();
			
			driver.close();
	}		
}		
					
					
			
			
			
			
			
			

			
			
			
		

	

		
	



package org.task2;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazon extends BaseClass {
	
	@BeforeClass
	private void beforeclass() {
		chromeBrowser();
		urlLaunch("https://www.amazon.in/");
		}
	
	@BeforeMethod
	private void beforemethod() {
		implicitlyWait(5000);
		System.out.println("starting time"+ new Date());
		
	}
	
	
	@Test
	private void test() {
		search s= new search();
		sendKeys(s.getSearchbox(),"redmi notye 7");
		click(s.getSearchbutton());
		for(int i=0; i< s.getMobiles().size();) {
			
			for(int j=0;j< s.getPrice().size();j++) {
				String list =s.getMobiles().get(i).getText();
				System.out.println("Mobiles"+ list);
				
				String list2= s.getPrice().get(j).getText();
				System.out.println("Prices"+ list2);
				i++;
			}
		}
		
	}
	
	
	@AfterMethod
	private void aftermethod() {
		System.out.println("ending time"+ new Date());
	
	}
	
	
	@AfterClass
	private void afterclass() {
		quit();
	}  
	
	

}

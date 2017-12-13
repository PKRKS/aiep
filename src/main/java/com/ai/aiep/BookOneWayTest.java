package com.ai.aiep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookOneWayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","xxxxx\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.airindia.in/");
		
		
		
		
		driver.findElement(By.className("iradio")).click();
		WebDriverWait w2=new WebDriverWait(driver,5);
		
		driver.findElement(By.id("from")).sendKeys("hyd");
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("spnfromandtolocationsame")));
		
		
		
		
//		driver.findElement(By.xpath("//*a[contains(text(), 'Hyderabad')]")).click();
//		
//		
//		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		driver.close();
		
	}

}

package com.ai.aiep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUHITHREDDY\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		
		WebDriverWait wd=new WebDriverWait(driver,5);
		wd.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"))));
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
		//Dec 25
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();

		
	while(!driver.findElement(By.cssSelector("[class='ui-datepicker-group ui-datepicker-group-last'] [class='ui-datepicker-title']")).getText().contains("May")) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.xpath("//a[@title='Next']")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
			List<WebElement> dates=driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
				//List<WebElement> dates=driver.findElements(By.className("ui-state-default"));
				
				
				int count=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).size();		
		//int count=driver.findElements(By.className("ui-state-default")).size();
	
	
		
	for(int i=0;i<count;i++) {
			
			String text=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();			
			
			//String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
			if(text.equalsIgnoreCase("20")) {
				
				
			
			driver.findElements(By.cssSelector("(td[data-handler='selectDay'])[2]")).get(i).click();
			
			//driver.findElements(By.className("ui-state-default")).get(i).click();
			break;
			
		}
			
			
		}
		
		//driver.findElement(By.xpath("(//a[@class='ui-state-default'])[2]")).click();
		

	}

}

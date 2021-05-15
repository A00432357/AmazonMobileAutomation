package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class YouTubeTest extends BaseClass {
	
	@Test
	public void testTwo() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@index='4']"))));
	    driver.findElement(By.xpath("//android.widget.Button[@index='4']")).click();
	    Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@index='3']"))));
	    driver.findElement(By.xpath("//android.widget.Button[@index='3']")).click();
	    Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@index='2']"))));
	    driver.findElement(By.xpath("//android.widget.Button[@index='2']")).click();
	    Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@index='1']"))));
	    driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
	    Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    
	}	
	}


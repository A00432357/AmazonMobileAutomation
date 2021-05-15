package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AmazonTest extends BaseClass {

	@Test
	public void amazonTShirtTest() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		try { 
			Thread.sleep(2000);
			//Steps to Skip Signin button
			//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@text= 'Skip sign in']"))));
			//driver.findElement(By.xpath ("//android.widget.Button[@text= 'Skip sign in']")).click();

			//Steps to Successfully signin
			//Wait for Signin button and clicking on it 
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@text='Already a customer? Sign in']"))));
			driver.findElement(By.xpath ("//android.widget.Button[@text='Already a customer? Sign in']")).click();

			//Enter email

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath ("//android.widget.EditText[@index='1']")));
			driver.findElement(By.xpath ("//android.widget.EditText[@index='1']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath ("//android.widget.EditText[@index='1']")));
			driver.findElement(By.xpath ("//android.widget.EditText[@index='1']")).sendKeys("amazontesttrack@gmail.com");
			Reporter.log("Email entered \n");

			//Clicking on continue button
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@text='Continue']"))));
			driver.findElement(By.xpath ("//android.widget.Button[@text='Continue']")).click();

			// Inputting password
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath ("//android.widget.EditText[@index='1']")));
			driver.findElement(By.xpath ("//android.widget.EditText[@index='1']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath ("//android.widget.EditText[@index='1']")));
			driver.findElement(By.xpath ("//android.widget.EditText[@index='1']")).sendKeys("Amazontest@123");
			Reporter.log("Password entered");

			//Clicking on Signin Button
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@text='Sign-In']"))));
			driver.findElement(By.xpath ("//android.widget.Button[@text='Sign-In']")).click();
			Reporter.log("user is successfully logged in");

			//Clicking on NotNow for adding cell Number
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath ("//android.widget.TextView[@text='Not now']")));
			//driver.findElement(By.xpath ("//android.widget.TextView[@text='Not now']")).click();

			//Validating and asserting elements on the landing page of app
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath ("//android.widget.ImageView[contains(@resource-id,'com.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon')]")));
			Assert.assertTrue(driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'com.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon')]")).isEnabled());
			Reporter.log("Menu bar is visibe");

			driver.findElement(By.xpath ("//android.widget.ImageView[contains(@resource-id,'com.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon')]")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath ("//android.widget.TextView[@text='Home']")));
			Reporter.log("Home option found");

			driver.findElement(By.xpath ("//android.widget.TextView[@text='Home']")).click();
			Reporter.log("Home option Clicked");

			// Validating whether Search bar is present and clicking on it
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rs_search_src_text")));
			driver.findElement(By.xpath ("//android.widget.EditText[@text='What are you looking for?']")).click();
			Reporter.log("Search bar found");

			//Inputting Search text
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("rs_search_src_text")));
			driver.findElement(By.xpath ("//android.widget.EditText[@text='Search']")).sendKeys("T-Shirts for Men");

			//Clicking on Enter Key
			driver.pressKey(new KeyEvent(AndroidKey.ENTER));

			//Scrolling until we get the Amazon Choice and clicking on it
			String Id="B077ZJXCTS-amazons-choice-label";
			int index= 0;
			scrollByID(Id, index);



		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void scrollByID(String Id, int index) {

		try {

			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""+Id+"\").instance("+index+"));")).click(); 


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
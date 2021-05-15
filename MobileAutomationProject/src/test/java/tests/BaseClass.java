package tests;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public AndroidDriver<MobileElement> driver;

	//public static AndroidDriver driver;

	@BeforeTest
	public void setup() {
		try {
			DesiredCapabilities caps= new DesiredCapabilities(); 

			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/Apps/");
			File app = new File(appDir, "Amazon.apk");



			caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S9+");
			caps.setCapability(MobileCapabilityType.UDID, "335a4f454f553098");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			caps.setCapability("app", app.getAbsolutePath());
			caps.setCapability("app-Package","com.amazon.mShop.android.shopping");
			caps.setCapability("app-Activity","com.amazon.mShop.sso.SigninPromptMigrationActivity");


			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);


		} catch (Exception exp) {
			System.out.println("Cause is: "+exp.getCause());
			System.out.println("Message is: "+exp.getMessage());
			exp.printStackTrace();
		}
	}


	@AfterSuite
	public void teardown() {
		driver.close();
		driver.quit();

	}
}

# AmazonMobileAutomation

This project is designed to Automate amazon application on Android Mobile using Selenium and TestNG

**Prerequisites:**
1. Java JDK 
2. Appium is installed
3. Android sdk is setup
4. Mobile device is ready for automation run
5. Eclipse is installed 

**Capabilities Added:**
|Capability|Description|Values|
|----|-----------|-------|
|`platformName`|Which mobile OS platform to use|`iOS`, `Android`, or `FirefoxOS`|
|`platformVersion`|Mobile OS version|e.g., `9`, `10`|
|`deviceName`|The kind of mobile device or emulator to use| 'Galaxy S9+' or 'OnePlus6'|
|`udid`|The unquie device id displayed when Android Mobile is connected to System via USB port|'335a4f454f553098'|
|`newCommandTimeout`|How long (in seconds) Appium will wait for a new command from the client before assuming the client quit and ending the session|e.g. `60`|
|`automationName`|Which automation engine to use|`Appium` (default), or `UiAutomator2`|
|`app`|The absolute local path _or_ remote http URL to`.apk` file (Android) or `.apks` file (Android App Bundle), or a `.zip` file containing one of these. Appium will attempt to install this app binary on the appropriate device first. Note that this capability is not required for Android if you specify `appPackage` and `appActivity` capabilities (see below). `UiAutomator2` and `XCUITest` allow to start the session without `app` or `appPackage`. Incompatible with `browserName`. See [here](/docs/en/writing-running-appium/android/android-appbundle.md) about `.apks` file.|`/abs/path/to/my.apk` or `http://myapp.com/app.ipa`|
|`appPackage`| Java package of the Android app you want to run. By default this capability is received from the package manifest (@package attribute value)|`com.example.android.myApp`, `com.android.settings`|
|`appActivity`| Activity name for the Android activity you want to launch from your package. This often needs to be preceded by a `.` (e.g., `.MainActivity` instead of `MainActivity`). By default this capability is received from the package manifest (action: android.intent.action.MAIN , category: android.intent.category.LAUNCHER) |`MainActivity`, `.Settings`|

**Steps to Clone the repository and run test scripts locally:**
1) Navigate to AmazonMobileAutomation repository and , Click on Code and copy the clone Url
![image](https://user-images.githubusercontent.com/46535033/118383097-6576aa00-b5d1-11eb-8ef7-dd729390e2d3.png)



**IMPORTANT FILES**

1) `AmazonMobileAutomation/MobileAutomationProject/Apps` -- This folder contains Android apps that will be tested locally.

2) `AmazonMobileAutomation/MobileAutomationProject/src/test/java/tests/BaseClass.java` -- This class has all the necessary setup and teardown functions.

3) `AmazonMobileAutomation/MobileAutomationProject/src/test/java/tests/AmazonTest.java` -- This class has the script to be run for logging in to the Amazon application and performing the search functionlaity.

4) `AmazonMobileAutomation/MobileAutomationProject/test-output/index.html`-- This file contains the previous run results and is updated after every local run.

5) `AmazonMobileAutomation/MobileAutomationProject/pom.xml`-- This file consists of all the required dependecies for running the Automation framework.




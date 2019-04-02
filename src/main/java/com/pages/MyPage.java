package com.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MyPage {

	WebDriver driver;
	public static AppiumDriver<MobileElement> mobileDriver;
	DesiredCapabilities capabilities;
	
	public void initilise() {
		System.out.println(System.getProperty("user.dir"));
		System.out.println("Initilising drivers...");
		System.setProperty("webdriver.chrome.driver", "/home/ubuntu/sampleapprepo/driver/chromedriver_38");

ChromeOptions options = new ChromeOptions();

        options.addArguments("headless");
        options.addArguments("window-size=1200x600");

		driver = new ChromeDriver(options);
		driver.get("http://google.com");
		System.out.println("Title;---" + driver.getTitle());
		driver.quit();
		/*capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "android");
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("platformVersion", "11.3");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		
		try {
			mobileDriver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mobileDriver.quit();*/
	}
}

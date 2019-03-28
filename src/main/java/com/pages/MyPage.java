package com.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MyPage {

	WebDriver driver;
	public static AppiumDriver<MobileElement> mobileDriver;
	DesiredCapabilities capabilities;
	
	public void initilise() {
		System.out.println("Initilising drivers...");
		//System.setProperty("webdriver.chrome.driver", "D:\\workspace\\jenekins\\com.seleniumjenekins\\driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("http://google.com");
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "android");
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("platformVersion", "11.3");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		
		try {
			mobileDriver = new AndroidDriver<>(new URL("http://0.0.0.0:4723"), capabilities);
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
		driver.quit();
	}
}

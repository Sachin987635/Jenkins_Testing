package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public ChromeDriver driver;
	public Properties properties;
	@BeforeMethod
	public void init() throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");//Used for disable notifications
		driver=new ChromeDriver(options);//Given options for disable notifications 
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		//Properties file loading
		File propertiesfile=new File("../YtFramework/Objects.properties");
		FileInputStream fileinputstream=new FileInputStream(propertiesfile);
		properties=new Properties();
		properties.load(fileinputstream);
	}
	@AfterMethod
	public void closebrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
}

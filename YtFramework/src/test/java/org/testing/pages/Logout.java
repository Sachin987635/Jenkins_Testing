package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
	public ChromeDriver driver;
	public Properties properties;
	public Logout(ChromeDriver driver,Properties properties) {
		this.driver=driver;
		this.properties=properties;
	}
	public void signout() throws InterruptedException {
		driver.findElement(By.xpath(properties.getProperty("AfterloginAccountMenu"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("LogoutButton"))).click();
	}
}

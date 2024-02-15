package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public ChromeDriver driver;
	public Properties properties;
	public Login(ChromeDriver driver,Properties properties){
		this.driver=driver;
		this.properties=properties;
	}
	public void signin(String username,String password) throws InterruptedException {
		//Login Process
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("GuestIcon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Emailfield"))).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("PasswordField"))).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		Thread.sleep(3000);
		
	}
}

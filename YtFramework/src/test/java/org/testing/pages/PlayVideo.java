package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayVideo {
	public ChromeDriver driver;
	public Properties properties;
	public PlayVideo(ChromeDriver driver,Properties properties) {
		this.driver=driver;
		this.properties=properties;
	}
	public void videotitleclick() throws InterruptedException {
		WebElement ele= driver.findElement(By.xpath(properties.getProperty("PlayVideo")));
		if(ele.isDisplayed()) {
			ele.click();
			Thread.sleep(3000);
		}
		
	}
}

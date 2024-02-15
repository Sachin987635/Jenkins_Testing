package org.testing.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.TestBase;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.pages.PlayVideo;
import org.testng.annotations.Test;

public class TC6 extends TestBase{
	@Test	
	public void LoginVideoplay_CommentOnVideo() throws InterruptedException {
		//Login
		Login login=new Login(driver, properties) ;
		login.signin("testingfw472@gmail.com","Testfw@786");
		//Play video
		PlayVideo videoclick=new PlayVideo(driver, properties);
		videoclick.videotitleclick();
		//Channel Comment On video
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("CommentPlaceHolder"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("EnabledCommentField"))).sendKeys("️like");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("ClickCommentButton"))).click();
		Thread.sleep(3000);
		//Logout
		Logout logout=new Logout(driver, properties);
		logout.signout();
	}
}

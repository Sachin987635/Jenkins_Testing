package org.testing.Testscripts;

import org.openqa.selenium.By;
import org.testing.Base.TestBase;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.pages.PlayVideo;
import org.testng.annotations.Test;

public class TC5 extends TestBase{
	@Test	
	public void LoginVideoplay_ChannelSubs() throws InterruptedException {
		//Login
		Login login=new Login(driver, properties) ;
		login.signin("testingfw472@gmail.com","Testfw@786");
		//Play video
		PlayVideo videoclick=new PlayVideo(driver, properties);
		videoclick.videotitleclick();
		//Channel Subscribe
		driver.findElement(By.xpath(properties.getProperty("ChannelSubscribe"))).click();
		Thread.sleep(3000);
		//Logout
		Logout logout=new Logout(driver, properties);
		logout.signout();
	}
}

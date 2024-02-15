package org.testing.Testscripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testing.Base.TestBase;
import org.testing.Utilities.CaptureScreenshot;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testng.annotations.Test;

public class TC1 extends TestBase{
	@Test	
	public void LoginTrendingclick() throws InterruptedException, IOException {
		//Login
		Login login=new Login(driver, properties) ;
		login.signin("testingfw472@gmail.com","Testfw@786");
		//Click on Trending
		driver.findElement(By.xpath(properties.getProperty("Trending"))).click();
		Thread.sleep(3000);
		CaptureScreenshot.takescreenshot(driver, "C:\\Users\\user\\OneDrive\\Desktop/img.png");
		//Logout
		Logout logout=new Logout(driver, properties);
		logout.signout();
	}
}
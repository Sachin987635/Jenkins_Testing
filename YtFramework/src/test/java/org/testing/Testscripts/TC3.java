package org.testing.Testscripts;

import org.openqa.selenium.By;
import org.testing.Base.TestBase;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testng.annotations.Test;

public class TC3 extends TestBase{

	@Test	
	public void LoginSubscriptionsclick() throws InterruptedException {
		//Login
		Login login=new Login(driver, properties) ;
		login.signin("testingfw472@gmail.com","Testfw@786");
		//Click on Subscriptions
		driver.findElement(By.xpath(properties.getProperty("SubscriptionClick"))).click();
		//Logout
		Logout logout=new Logout(driver, properties);
		logout.signout();
	}
}

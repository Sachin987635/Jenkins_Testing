package org.testing.Testscripts;

import org.openqa.selenium.By;
import org.testing.Base.TestBase;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testng.annotations.Test;

public class TC2 extends TestBase{
	@Test	
	public void LoginHistoryclick() throws InterruptedException {
		//Login
		Login login=new Login(driver, properties) ;
		login.signin("testingfw472@gmail.com","Testfw@786");
		//Click on History Click
		driver.findElement(By.xpath((properties.getProperty("HistoryClick")))).click();
		//Logout
		Logout logout=new Logout(driver, properties);
		logout.signout();
	}
}

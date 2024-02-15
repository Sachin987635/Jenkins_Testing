package Day23Jan9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GotoPopup_Practice {
	@Test
	public void accepalert() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		//Jump to frame
		driver.switchTo().frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame")));
		try {
			Thread.sleep(10000);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		driver.switchTo().parentFrame(); //Comeback to parent frame
		driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/hotels/']")).click();
	}
}
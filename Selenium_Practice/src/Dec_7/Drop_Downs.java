package Dec_7;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_Downs {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "../Selenium_Practice/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		for(int i=0;i<3;i++) {
			ac.sendKeys(Keys.TAB).perform();
		}
	}
}

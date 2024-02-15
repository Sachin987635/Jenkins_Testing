package Dec_7;

import org.openqa.selenium.By;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Youtube_new_tab_open {
	WebDriver driver=new EdgeDriver();
	public void Invoke_browser() {
		System.setProperty("webdriver.edge.driver", "../Selenium_Practice/msedgedriver.exe");
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	}
	public void logic() {
		Actions ac=new Actions(driver);
		WebElement video=driver.findElement(By.id("video-title"));
		for(int i=0;i<3;i++) {
			ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		}
		int count=0;
		Set<String> alltabs=driver.getWindowHandles();
		for(String currenttab: alltabs) {
			count=count+1;
			if(count==2) {
				driver.switchTo().window(currenttab);
			}
		}
		System.out.println(driver.getTitle());
	
	}
	public static void main(String[] args) {
		Youtube_new_tab_open obj=new Youtube_new_tab_open();
		obj.logic();
	}
}

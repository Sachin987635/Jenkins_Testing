package Day15Dec9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeClass {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		WebElement Video=driver.findElement(By.id("video-title"));
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(Video).keyUp(Keys.CONTROL).perform();
		
		Set<String> AllWindows=driver.getWindowHandles();
		for(String s:AllWindows) {
			driver.switchTo().window(s);
		}
	}
}

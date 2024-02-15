package Dec_7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Findelements_vs_findelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "../Selenium_Practice/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement firsttab=driver.findElement(By.id("video-title"));
		List<WebElement> listelements=driver.findElements(By.id("video-title"));
		System.out.println(listelements.size());
		
	}
}

package Nov_21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {
	public void DropDownHandling(WebElement element,String Visibletext) {
		Select s=new Select(element);
		s.selectByVisibleText(Visibletext);
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Selenium_Practice/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-testid=\'open-registration-form-button\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Sachin");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys("70098");
		driver.findElement(By.id("password_step_input")).sendKeys("Test123@");
		Thread.sleep(3000);
		Signup obj=new Signup();
		WebElement dropdown1=driver.findElement(By.id("day"));
		obj.DropDownHandling(dropdown1, "1");
		WebElement dropdown2=driver.findElement(By.id("month"));
		obj.DropDownHandling(dropdown2, "Jan");
		WebElement dropdown3=driver.findElement(By.id("year"));
		obj.DropDownHandling(dropdown3, "1998");
		driver.findElement(By.cssSelector("input[value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("websubmit")).click();
	}
}
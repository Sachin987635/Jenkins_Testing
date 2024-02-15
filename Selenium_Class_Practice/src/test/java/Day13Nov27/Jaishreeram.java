package Day13Nov27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jaishreeram {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Options op=driver.manage();
		Window win=op.window();
		win.maximize();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Sachin");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("Test@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Test@gmail.com");
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("Test");
		WebElement daydrop=driver.findElement(By.id("day"));
		Select s=new Select(daydrop);
		s.selectByVisibleText("29");
		WebElement monthdrop=driver.findElement(By.name("birthday_month"));
		Select s1=new Select(monthdrop);
		s1.selectByIndex(0);
		WebElement yeardrop=driver.findElement(By.id("year"));
		Select s2=new Select(yeardrop);
		s2.selectByValue("1998");
		driver.findElement(By.cssSelector("input[type='radio'][value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
	}
}

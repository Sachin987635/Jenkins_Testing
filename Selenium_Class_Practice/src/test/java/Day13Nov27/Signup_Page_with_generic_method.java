package Day13Nov27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup_Page_with_generic_method {
	public static void selectdropdown(WebElement driver,int val) {
		Select s=new Select(driver);
		s.selectByIndex(val);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname' and@placeholder='First name']")).sendKeys("Sachin");
		driver.findElement(By.xpath("//input[@name='lastname' or @placeholder='Last name']")).sendKeys("kumar");
		driver.findElement(By.xpath("//*[@*='reg_email__']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//input[@*='reg_email_confirmation__']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//*[@type='password' and @name='reg_passwd__']")).sendKeys("Testpass");
		WebElement dropdown1=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Signup_Page_with_generic_method.selectdropdown(dropdown1, 3);
		WebElement dropdown2=driver.findElement(By.xpath("//select[@id='month']"));
		Signup_Page_with_generic_method.selectdropdown(dropdown2,3);
		WebElement dropdown3=driver.findElement(By.xpath("//select[@id='year']"));
		Signup_Page_with_generic_method.selectdropdown(dropdown3,3);
		driver.findElement(By.xpath("(//span/input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}
}

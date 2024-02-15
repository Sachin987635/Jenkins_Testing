package Nov_27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Nov_21.Signup;

public class Signup_page_with_Xpath {
	public void GenericMethod(WebElement element,String Visibletext) {
		Select s=new Select(element);
		s.selectByVisibleText(Visibletext);
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Selenium_Practice/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sachin");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__' and @aria-label='Mobile number or email address']")).sendKeys("70098");
		driver.findElement(By.xpath("//input[@data-type='password' or @abc='new']")).sendKeys("Test123@");
		Thread.sleep(3000);
		Signup_page_with_Xpath obj=new Signup_page_with_Xpath();
		WebElement dropdown1=driver.findElement(By.xpath("//*[@name='birthday_day']"));
		obj.GenericMethod(dropdown1, "1");
		WebElement dropdown2=driver.findElement(By.xpath("//*[@name='birthday_month']"));
		obj.GenericMethod(dropdown2, "Jan");
		WebElement dropdown3=driver.findElement(By.xpath("//*[@name='birthday_year']"));
		obj.GenericMethod(dropdown3, "1998");
		driver.findElement(By.xpath("//input[@type='radio'and@name='sex'and@value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}
}

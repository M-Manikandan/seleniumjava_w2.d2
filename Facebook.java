package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Angel");
		driver.findElement(By.name("lastname")).sendKeys("G");
		driver.findElement(By.name("reg_email__")).sendKeys("123456890");
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		
		WebElement birthdayday = driver.findElement(By.id("day")); 
		new Select(birthdayday).selectByVisibleText("1");
		
		WebElement birthdaymonth = driver.findElement(By.id("month")); 
		new Select(birthdaymonth).selectByVisibleText("Jan"); 
		
		WebElement birthdayyear = driver.findElement(By.id("year")); 
		new Select(birthdayyear).selectByVisibleText("2021"); 
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		

	}

}

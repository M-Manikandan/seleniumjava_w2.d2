package week2.day2;


	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class LGDD {
		public static void main(String[] args) 
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leafground.com/pages/Dropdown.html");
			//maximize the window 
			driver.manage().window().maximize();
			//select training program using index
			WebElement dropdown= driver.findElement(By.id("dropdown1"));
			//converting webelement to select class 
			Select choose=new Select(dropdown);
			//choose training program using index 
			choose.selectByIndex(3);
			//choose training program using text
			WebElement dropdown1= driver.findElement(By.name("dropdown2"));
			//converting webelement to select class 
			Select choose1=new Select(dropdown1);
			//choose training program using text 
			choose1.selectByVisibleText("Appium");
			//choose training program using value
			WebElement dropdown2= driver.findElement(By.id("dropdown3"));
			//converting webelement to select class 
			Select choose2=new Select(dropdown2);
			//choose training program using text 
			choose2.selectByValue("3");
			//number of dropdown options 
			//List<WebElement> dropdowncount= driver.findElements(By.className("dropdown"));
			//Select choose3= new Select((WebElement) driver.findElements(By.className("dropdown")));
					//int count= ((List<WebElement>) choose3).size();
				//	System.out.println("The number of options in this dropdown are:"+count);
					//sendKeys doubt 
			//disabled dropdown		
	     // WebElement ele= driver.findElement(By.cssSelector("div#contentblock>section>div:nth-of-type(6)>select>option:nth-of-type(3)"));
	      //ele.isEnabled();
	     
			}
	}
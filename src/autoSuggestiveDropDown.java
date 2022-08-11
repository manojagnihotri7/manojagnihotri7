import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class autoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//manojagnihotri//Downloads//chromedriver-2");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
		//System.out.println("Before SLEEP");
		Thread.sleep(3000);
		
		List<WebElement> l=new ArrayList<WebElement>();
		l=driver.findElements(By.xpath("//li[@class='ui-menu-item']")); 

				for(WebElement we:l)
		{
			
		if(we.getText().equalsIgnoreCase("India"))
		{
			we.click();
			System.out.println("Item Clicked Successfully");
			break;
		}
		}	
		driver.close();
		
	}
}
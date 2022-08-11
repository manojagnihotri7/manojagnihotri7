import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class staticDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//manojagnihotri//Downloads//chromedriver-2");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		List<WebElement> l=new ArrayList<WebElement>();
		l=driver.findElements(By.tagName("option"));
		for(WebElement d:l)
		{
			if(d.getText().equalsIgnoreCase("Option1"))
				//assert.Assert
			System.out.println(d.getText());
		}
		driver.close();
		
	}

}

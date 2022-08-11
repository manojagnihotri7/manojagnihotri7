import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropDown2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//manojagnihotri//Downloads//chromedriver-2");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select sdd=new Select(dropDown); 
		sdd.selectByIndex(2);
		System.out.println(sdd.getFirstSelectedOption().getText());
		driver.close();
		
	}

}

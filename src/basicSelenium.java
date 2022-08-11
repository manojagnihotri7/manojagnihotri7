import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicSelenium {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "//Users//manojagnihotri//Downloads//chromedriver-2");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("India");
		
				
	}

}

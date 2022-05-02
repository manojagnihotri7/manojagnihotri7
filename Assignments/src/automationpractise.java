	import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class automationpractise  {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "//Users//manojagnihotri//Downloads//chromedriver");
			WebDriver d =new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor)d;
		d.get("http://automationpractice.com");
		d.manage().window().maximize();
		d.findElement(By.className("login")).click();
		d.findElement(By.id("email")).sendKeys("manoj.agni47@gmail.com");
		d.findElement(By.id("passwd")).sendKeys("mansan");
		d.findElement(By.id("SubmitLogin")).click();
		d.findElement(By.xpath("//a[@title='Women']")).click();
		d.findElement(By.linkText("Tops")).click();
		d.findElement(By.linkText("T-shirts")).click();
		d.findElement(By.id("layered_id_attribute_group_2")).click();
		d.findElement(By.id("layered_id_attribute_group_14")).click();
		

		//Creating object of an Actions class
		Actions action = new Actions(d);

		//Performing the mouse hover action on the target element.
		action.moveToElement(d.findElement(By.xpath("//div[@class='product-image-container']"))).perform();
		
		
		
		d.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
		
		
		Set<String> windows = d.getWindowHandles(); //[parentid,childid,subchildId]

		Iterator<String>it = windows.iterator();

		System.out.println("The window handles return is     "+it.next());
		System.out.println("Hello Just before switching Windows");
		//d.switchTo().window(it.next());
		System.out.println("Hello Just After switching Windows");
		Thread.sleep(2000);
		
		//*[@id="layer_cart"]/div[1]/div[2]/div[4]/a/span
		
		System.out.println("Hello Just before Proceed to Cart");
		WebElement we1=d.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));   //*[@id="layer_cart"]/div[1]/div[2]/div[4]/a
		if(we1!= null){

			System.out.println("Element is Present");

			}

			else{

			System.out.println("Element is Absent"); 

			}
		//we1.click();
		js.executeScript("arguments[0].click();", we1);
		d.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		d.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		d.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		d.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
		d.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")).click();
		
		d.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//*[@id=\"center_column\"]/p/a")).click();  //*[@id="center_column"]/p/a
		
		
		}

	}
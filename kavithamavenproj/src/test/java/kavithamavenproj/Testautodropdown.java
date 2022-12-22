package kavithamavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testautodropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("speed"))).selectByVisibleText("Faster");
		Thread.sleep(3000);

		new Select(driver.findElement(By.id("files"))).selectByVisibleText("PDF file");
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("number"))).selectByVisibleText("4");
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("products"))).selectByVisibleText("Iphone");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("animals"))).selectByVisibleText("Baby Cat");

		
		
	}

}

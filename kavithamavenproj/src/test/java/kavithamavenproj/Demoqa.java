package kavithamavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Created")).click();
		Thread.sleep(5000);

		driver.findElement(By.linkText("No Content")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Moved")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Bad Request")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Unauthorized")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Forbidden")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Not Found")).click();

		
		
		
	}

}

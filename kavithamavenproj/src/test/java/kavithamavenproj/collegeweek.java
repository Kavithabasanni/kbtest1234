package kavithamavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class collegeweek {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup");
		driver.findElement(By.id("firstName")).sendKeys("sumana");
		driver.findElement(By.id("lastName")).sendKeys("basani");
		driver.findElement(By.id("emailAddress")).sendKeys("abc@abc.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("1236549");
		driver.findElement(By.id("password")).sendKeys("suma123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("suma123");
		Select c=new Select(driver.findElement(By.id("country")));
		c.selectByVisibleText("ALBANIA");
		Select c1=new Select(driver.findElement(By.name("attendeeType")));
		c1.selectByVisibleText("Parent");
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();

		driver.findElement(By.id("questions[q_137]")).click();
		Thread.sleep(500);
		driver.findElement(By.id("submit")).click();


	}

}

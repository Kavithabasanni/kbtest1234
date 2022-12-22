package kavithamavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Justrecharge {

	public static void main(String[] args) {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.justrechargeit.com/index_justrecharge.aspx");
		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.id("signup_name")).sendKeys("kavitha");
		driver.findElement(By.id("signup_mobileno")).sendKeys("122378965");		
		driver.findElement(By.id("signup_email")).sendKeys("kavitha@abc.com");		
		driver.findElement(By.id("signup_password")).sendKeys("kavitha");	
		driver.findElement(By.id("imgbtnSubmit")).click();

	}

}

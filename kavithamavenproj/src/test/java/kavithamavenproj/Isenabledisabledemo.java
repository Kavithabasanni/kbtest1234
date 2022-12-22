package kavithamavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabledisabledemo {

	public static void main(String[] args) {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/dooda/Contacts/Desktop/QE%20-%20index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputEmail")).sendKeys("kavitha");
		driver.findElement(By.id("inputPassword")).sendKeys("kavitha");	
		driver.findElement(By.className("btn btn-lg btn-primary btn-block")).click();
		
		

	}

}

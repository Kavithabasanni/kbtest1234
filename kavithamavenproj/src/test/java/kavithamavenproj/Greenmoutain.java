package kavithamavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenmoutain {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://myaccount.greenmountain.com/en_US/register");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Contact Us")).click();
	}

}

package kavithamavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.id("Button2")).click();
		driver.switchTo().alert();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("New User ? Register here/Activate ")).click();
		driver.findElement(By.xpath("//a[contains(text(),'New User ? Register here/Activate')]")).click();
		driver.switchTo().alert();
		String s1=driver.switchTo().alert().getText();
		System.out.println(s1);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
				
		
		
		
		
		
		
	}

}

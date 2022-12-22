package kavithamavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("abcdsf");
		driver.findElement(By.id("txtPasswd")).sendKeys("kavi");
		driver.findElement(By.id("txtCaptcha")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.name("imgbtnSignin")).click();
		
	}

}

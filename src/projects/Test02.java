package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Share\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en_in/gmail/about/");
		driver.findElement(By.linkText("Create an account")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.name("Username")).sendKeys("test1234");
		Thread.sleep(1000);
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("test@123#");
		Thread.sleep(1000);
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("test@123#");
		Thread.sleep(1000);
		driver.close();
	}
	
}

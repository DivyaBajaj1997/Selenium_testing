package projects;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOver {
	public static void takepicture(WebDriver driver, String filename) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".//screenshots//"+filename+".png"));
	}
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Share\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
		Thread.sleep(3000);
		for(int i=0;i<4;i++)
		{
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		takepicture(driver, "img1");
		/*takepicture(driver, "img1");
		Actions action = new Actions(driver);
		WebElement electronics = driver.findElement(By.linkText("Gift Ideas"));
		action.moveToElement(electronics).build().perform();
		takepicture(driver, "img2");
		Thread.sleep(2000);
		WebElement samsung = driver.findElement(By.linkText("Hot New Releases"));
		action.moveToElement(samsung).build().perform();
		takepicture(driver, "img3");
		Thread.sleep(2000);
		WebElement book = driver.findElement(By.linkText("The Rudest Book Ever"));
		action.moveToElement(samsung).build().perform();
		takepicture(driver, "img3");
		Thread.sleep(2000);
		book.click();
		takepicture(driver, "img4");*/
	}
}

package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		WebElement button;
		button = driver.findElement(By.id("doubleClickBtn"));
		
		//action double clique
		Actions action= new Actions(driver);
		action.doubleClick(button).perform();
		
		WebElement message;
		message = driver.findElement(By.id("doubleClickMessage"));
		
		String text;
		text= message.getText();
		
		Assert.assertEquals(text,"You have done a double click");
		System.out.println("test double clique ok");


		
	}

}

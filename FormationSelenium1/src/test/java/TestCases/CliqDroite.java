package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CliqDroite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		WebElement button;
		button = driver.findElement(By.id("rightClickBtn"));
		
		Actions action = new Actions(driver);
		action.contextClick(button).perform();
		
		WebElement msg;
		msg= driver.findElement(By.id("rightClickMessage"));
		
		String text;
		text= msg.getText();
		
		Assert.assertEquals(text, "You have done a right click");
		System.out.println("cliquer droitr ok");

	}

}

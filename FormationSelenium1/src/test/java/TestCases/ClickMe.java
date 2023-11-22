package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.aventstack.extentreports.reporter.configuration.Theme;

public class ClickMe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		WebElement button;
		button = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
		
		Actions action= new Actions(driver);
		action.click(button).perform();
		
		WebElement msg;
		msg = driver.findElement(By.id("dynamicClickMessage"));

		String text;
		text = msg.getText();
		
		Assert.assertEquals(text,"You have done a dynamic click");
		System.out.println("test double clique ok");

		
		
		
	}

}

package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrasSouris {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/menu#");
		Thread.sleep(5000);
		
		WebElement button,button2;
		button = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		
		Actions action= new Actions(driver);
		action.moveToElement(button).perform();
		
		System.out.println("test ok");
		
		button2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));

		
		action.moveToElement(button2).perform();
		System.out.println("test2 ok");
	}

}

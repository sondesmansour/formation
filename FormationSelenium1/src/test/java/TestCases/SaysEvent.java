package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SaysEvent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/text-box");
	
		WebElement imput,imputcopie;
		imput= driver.findElement(By.id("currentAddress"));
		imputcopie = driver.findElement(By.id("permanentAddress"));
		//action
		imput.sendKeys("sondes");
		
		
		
		//action2
		Actions action= new Actions(driver);
		action.keyDown(imput, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(imput, Keys.CONTROL).perform();
		
		
		action.keyDown(imputcopie,Keys.CONTROL).sendKeys("v").keyUp(imputcopie, Keys.CONTROL).perform();


		
		System.out.println("test ok");
		
	
	}

}

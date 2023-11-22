package TestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListeRelante {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/select-menu");
		
		
		//Thread.sleep(5000);
		//impticity wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement buttonSlct;
		buttonSlct = driver.findElement(By.id("oldSelectMenu"));
		
		Select slct= new Select(buttonSlct);
		slct.selectByValue("5");
		System.out.println("test ok");


	}

}

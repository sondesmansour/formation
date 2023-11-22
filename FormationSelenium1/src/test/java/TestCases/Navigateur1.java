package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur1 {

	public static void main(String[] args) {
		
		//bech n7el l5edma f navigateur x
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//bech y7el navigateur (declare un navigateur vide)
		WebDriver driver;
		//bech n7elou 
		driver= new ChromeDriver();
		//maximaze windiw
		driver.manage().window().maximize();
		//delete cookis
		driver.manage().deleteAllCookies();
		//ouvrire URL
		driver.get("https://www.google.com/");
		//ou
		//driver.navigate().to("https://www.google.fr");
		
		
		//declaration des variables
		WebElement recherche;
		//identification des variables
		recherche = driver.findElement(By.name("q"));
		//action
		recherche.sendKeys("tunisie");
		
		//close chrome
		//driver.close();
	}

}

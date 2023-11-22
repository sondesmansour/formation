package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestOrangeAuthontification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		WebElement login,password,connexion;
		
		login = driver.findElement(By.name("username"));
		password = driver.findElement(By.name("password"));
		connexion = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		login.sendKeys("Admin");
		password.sendKeys("admin123");
		connexion.click();
		Thread.sleep(5000);
		
		WebElement profil;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		
		String text;
		text= profil.getText();
		
		//commparision
		Assert.assertEquals(text,"test0 test2");
		System.out.println("test ok");
			
		
		
	}

}

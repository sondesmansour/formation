package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreeCompteFB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/index.php?next=https%3A%2F%2Fwww.facebook.com%2Fcheckpoint%2Fflow");
		
		
		//Thread.sleep(5000);
				//impticity wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ButtonCreeCompte, Prenom, Nom,Email,ConfEmail,Password,Jour, Mois,Anne,Femme,websubmit;
		ButtonCreeCompte= driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		
		Actions action=new Actions(driver);
		action.click(ButtonCreeCompte).perform();
		
		Prenom= driver.findElement(By.xpath("//input[@placeholder='Prénom']"));
		Prenom.sendKeys("sondes");
		
		Nom= driver.findElement(By.xpath("//input[@name='lastname']"));
		Nom.sendKeys("mansour");
		
		Email= driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.sendKeys("sondes.man@gmail.com");
		
		ConfEmail= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		action.keyDown(Email, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Email, Keys.CONTROL).perform();
		
		action.keyDown(ConfEmail, Keys.CONTROL).sendKeys("v").keyUp(ConfEmail, Keys.CONTROL).perform();
		
		
		Password= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Password.sendKeys("sondes123");
		
		Jour= driver.findElement(By.xpath("//select[@title='Jour']"));
		
		Select selectJ =new Select(Jour);
		selectJ.selectByValue("1");
		
		Mois= driver.findElement(By.xpath("//select[@title='Mois']"));
		
		Select selectM =new Select(Mois);
		selectM.selectByValue("8");
		
		Anne= driver.findElement(By.xpath("//select[@title='Année']"));
		
		Select selectA =new Select(Anne);
		selectA.selectByValue("1995");
		
		Femme= driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		
		action.click(Femme).perform();
		
		websubmit= driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		action.click(websubmit).perform();
		System.out.println("test ok");
		
		
	}

}

package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(5000);
		
		WebElement drag,drop;
		drag = driver.findElement(By.id("draggable"));
		drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		//WebElement msg;
		//msg = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		
		String text;
		text = drop.getText();
		
		Assert.assertEquals(text, "Dropped!");
		System.out.println("Drog And Drop ok");
		

	}

}

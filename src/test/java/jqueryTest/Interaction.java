package jqueryTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Interaction {

	public WebDriver driver;
	
	@Test
	public void draggableTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com");
		
		driver.findElement(By.linkText("Draggable")).click();
		
		//wait   
		//Implicite
		//Explicite
		//Fulent wait
		//Thread.sleep
		Thread.sleep(3*1000);
		//Exception -> two type
			//Runtime Exception
			//Compiltime Exception
		driver.switchTo().frame(0);
		Actions move = new Actions(driver); 
		WebElement dragBox = driver.findElement(By.id("draggable"));
		move.moveToElement(dragBox, 200, -300).build().perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();

		driver.quit();
	}
}

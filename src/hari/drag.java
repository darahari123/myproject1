package hari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("http://jqueryui.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Droppable")).click();
	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
				
				
				WebElement drag =    driver.findElement(By.id("draggable"));
				WebElement drop = driver.findElement(By.id("Droppable"));
				
				Actions act = new Actions(driver);
				act.dragAndDrop(drag, drop);
				act.build().perform();

	}

}

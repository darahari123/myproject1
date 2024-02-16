package hari;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdon {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://gmail.com");
	List<WebElement> link =  driver.findElements(By.tagName("a"));
	System.out.println(link.size());
/*	for(WebElement x: link) {
		System.out.println(x.getText());
	}*/
	//System.out.println(link.get(0).getText());
	
}}
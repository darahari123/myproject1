package hari;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primusbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com");
		
		
		
		//String hari1 = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		//System.out.println(hari1);
		/*List<WebElement> msg =driver.findElements(By.tagName("a"));
		System.out.println(msg.get(0).getText());
		System.out.println(msg.get(1).getText());
		System.out.println(msg.get(3).getText());
		System.out.println(msg.get(2).getText());*/
		
		
		
		/*for(WebElement x:msg) {
			System.out.println(x.getText());	
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*if(driver.findElement(By.linkText("demo")).isDisplayed()) {
			System.out.println(true);
		}
			else {
				System.out.println(false);
			}*/
		/*try {
			driver.findElement(By.linkText("Demo")).isDisplayed();
			System.out.println("true");
		}
		catch(Exception e) {
		System.out.println("shut not found");
		}*/
		 /*List<WebElement> len = driver.findElements(By.tagName("a"));
		        System.out.println(len.size());*/
		 
	}
		
			
		}
	





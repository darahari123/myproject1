package hari;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class quickcy {
	public static void main(String arg[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://quixy.com");
		driver.manage().window().maximize();
		List<WebElement> images =  driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
		String pgtittle = driver.getTitle();
		System.out.println(pgtittle);
         String pgurl = driver.getCurrentUrl();
         System.out.println(pgurl);
		driver.findElement(By.linkText("Get Demo")).click();
		driver.navigate().back();
		driver.findElement(By.id("wt-cli-accept-btn")).click();
		/*String rom = driver.findElement(By.className("_8eso")).getText();
	    System.out.println(rom);		
	    if(driver.findElement(By.name("login")).isDisplayed()) {
	    	System.out.println("true it is displaying");}
	    	else {
	    		System.out.println("false it is not displaying");}
	    		
	    		if(driver.findElement(By.linkText("Forgotten password?")).isDisplayed()) {
	    	    	System.out.println("yes true it is displaying");}
	    	    	else {
	    	    		System.out.println("false it is not displaying");}
	    		try {
	    			if(driver.findElement(By.linkText("demo")).isDisplayed()) {
	    				System.out.println("yes it is not true");
	    			}}
	    			catch(Exception e) {
	    				System.out.println("yes the above statement is correct");
	    				
	    			}
	    		String remi = driver.findElement(By.linkText("Create new account")).getText();
	    				System.out.println(remi);	
	    				List<WebElement> list =  driver.findElements(By.tagName("a"));
	    				       for(WebElement x:list) {
	    				    	   System.out.println(x.getText());
	    				       }*/
	    				
	    	
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		}		   	
	    }
		
	



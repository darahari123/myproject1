package hari;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://snapdeal.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("cartTextSpan")).click();
		WebDriverWait waits = new WebDriverWait(driver, 20);
		waits.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/section/div/div[1]/span/i")));
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/section/div/div[1]/span/i")).click();
		List<WebElement> elemt = driver.findElements(By.tagName("img"));
		System.out.println(elemt.size());
		String hari = driver.getCurrentUrl();
		System.out.println(hari);
		String hari1 = driver.getTitle();
		System.out.println(hari1);
		
		
		

	}

}

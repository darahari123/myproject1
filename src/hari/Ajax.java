package hari;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.tokens.FlowEntryToken;

public class Ajax {
	public static void main(String arg[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("ilovemy");
		Thread.sleep(3000);
		WebElement key = driver.findElement(By.className("G43f7e"));
		List<WebElement> element = key.findElements(By.tagName("li"));
		System.out.println(element.size());
		for(WebElement x : element) {
			//System.out.println(x.getText());
			
			if(x.getText().contains("ilovemypolish")) {
				x.click();
				break;
			}
			
		}
		driver.navigate().to("http://facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		Select ddate = new Select(driver.findElement(By.id("day")));
		ddate.selectByIndex(0);
		Select dmonth = new Select(driver.findElement(By.id("month")));
		dmonth.selectByValue("5");
		Select dyear = new Select(driver.findElement(By.id("year")));
		dyear.selectByValue("1996");
	}
}

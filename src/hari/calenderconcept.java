package hari;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calenderconcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	

		driver.get("http://flights.qedgetech.com");		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("dob")).click();

		Select mon =new Select(driver.findElement(By.className("ui-datepicker-month")));
		mon.selectByVisibleText("May");

		Select yer =new Select(driver.findElement(By.className("ui-datepicker-year")));
		yer.selectByValue("1995");

		Thread.sleep(2000);
		WebElement calender = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		
		List<WebElement> rows = calender.findElements(By.tagName("tr"));
         
		for(int i=1;i<rows.size();i++) 
		{
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));

			for(WebElement x:col) 
			{
				if(x.getText().equals("1")) 
				{
					x.click();
					break;
				}

			}
		}



	}

}

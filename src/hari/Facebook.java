package hari;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		 driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		List<WebElement> count = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(count.size());*/
		driver.get("http://money.rediff.com/tools/forex");
		WebElement tab =  driver.findElement(By.className("dataTable"));
		List<WebElement> tables =tab.findElements(By.tagName("tr"));
		List<WebElement> cols = tables.get(2).findElements(By.tagName("td"));
		System.out.println(cols.size());
		
		/*driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("name")).sendKeys("hari");
		driver.findElement(By.name("email")).sendKeys("darahari217@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Harikrishna@1");
		driver.findElement(By.name("contact")).sendKeys("8639632325");
		Select gender =new Select(driver.findElement(By.name("gender")));
		gender.selectByValue("M");
		driver.findElement(By.name("dob")).sendKeys("01-05-1996");
		Thread.sleep(2000);
		WebElement box = driver.findElement(By.id("flexCheckChecked"));
		if(!box.isSelected()) {
			box.click();
		}
		
		
		driver.findElement(By.name("submit")).click();*/
		
		
	
		
		
	
			
		
		
		


	}

}

package hari;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flights {


	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver","chromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//driver.get("http://snapdeal.com");
	
	//driver.findElement(By.xpath("//div[2]/div/div[3]/div[1]/div/i")).click();
	
	/*WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//section/div/div[1]/span/i"))));*/
			
	//driver.findElement(By.xpath("//section/div/div[1]/span/i")).click();
	
	/*driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://snapdeal.com");
	driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[3]/div[1]/div/i")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//section/div/div[1]/span/i")).click();*/
	//driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//driver.get("http://facebook.com");
	
	//driver.findElement(By.xpath("//input[contains(@placeholder,'phone')]")).sendKeys("demo");
	/*driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("demo.qedge");
	driver.findElement(By.name("pass")).sendKeys("demo");*/
	//driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();	
	
	/*driver.get("http://flights.qedgetech.com");
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.name("name")).sendKeys("hari");
	driver.findElement(By.name("email")).sendKeys("darahari217@gmail.com");
	driver.findElement(By.name("contact")).sendKeys("8639601844");
	driver.findElement(By.id("address")).sendKeys("Harikrishna@1");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.name("gender")).click();

	
	driver.findElement(By.name("dob")).sendKeys("01-05-1996");*/
	/*driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://google.com");
	
	driver.findElement(By.linkText("Sign in")).click();
	
	driver.findElement(By.name("identifier")).sendKeys("demo.qedge");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();*/
	driver.get("http://orangehrm.qedgetech.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.linkText("PIM")).click();
	//driver.navigate().back();
	List<WebElement> element = driver.findElements(By.xpath("//input[starts-with(@id,'ohrmList_chkSelectRecord')]"));
	for(WebElement x:element) {
		x.click();
	}
	driver.findElement(By.name("chkSelectAll")).click();
	driver.findElement(By.id("btnDelete")).click();
	//driver.findElement(By.id("dialogDeleteBtn")).click();
	/*driver.findElement(By.linkText("Leave")).click();
	driver.findElement(By.linkText("Apply")).click();
	driver.findElement(By.id("menu_leave_Reports")).click();*/
	
	//driver.findElement(By.linkText("Buy this domain")).click();
	//driver.navigate().back();
	/*driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://facebook.com");
	driver.findElement(By.linkText("Create new account")).click();
	
	driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();*/
	/*driver.get("http://flights.qedgetech.com");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("name")).sendKeys("Harikrishna");
	driver.findElement(By.id("contact")).sendKeys("8539604334");
	driver.findElement(By.id("email")).sendKeys("darahari217@gmail.com");
	driver.findElement(By.name("gender")).click();
	driver.findElement(By.name("password")).sendKeys("Harikrishna@1");
	driver.findElement(By.name("dob")).sendKeys("01-05-1996");
	driver.navigate().back();
	driver.findElement(By.name("email")).sendKeys("darahari217@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Harikrishna@1");
	driver.findElement(By.xpath("//*[@type='submit']")).click();*/
	//driver.findElement(By.name("email")).sendKeys("harikrishna");
	//driver.findElement(By.name("password")).sendKeys("Harikrishna");
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.id("email")).sendKeys("hari");
	//driver.findElement(By.id("pass")).sendKeys("harikrishna");
	//driver.findElement(By.name("login")).click();
	
	
	
	
	
	
	
	}
	
	
	
	

}

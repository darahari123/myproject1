package hari;

import java.net.MulticastSocket;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;
import org.openqa.selenium.support.ui.Select;

public class orangehrm {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	driver.get("https://www.railyatri.in/time-table");
	driver.manage().window().maximize();
	WebElement table = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/table"));
	List<WebElement> row = table.findElements(By.tagName("tr"));
	for(int i=1;i<row.size();i++)
	{
		List<WebElement> cols = row.get(i).findElements(By.tagName("td"));
		String trainno = cols.get(0).getText();
		String trainname = cols.get(1).getText();

		System.out.println(trainno+"   "+trainname);
	}
	
	
	
	
	
	/*List<WebElement> col = table.findElements(By.tagName("td"));
	System.out.println(row.size());
	System.out.println(row.get(0).getText());
	System.out.println(row.get(1).getText());
	for(WebElement x:row ) {
		System.out.println(x.getText());
	}*/


	/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.name("firstName")).sendKeys("remo");
	driver.findElement(By.name("lastName")).sendKeys("demo");
	driver.findElement(By.name("employeeId")).clear();
	driver.findElement(By.name("employeeId")).sendKeys("143143");
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.linkText("Employee List")).click();
	driver.findElement(By.id("empsearch_id")).sendKeys("143143");
	driver.findElement(By.id("searchBtn")).click();
	WebElement box = driver.findElement(By.id("resultTable"));
	List<WebElement> boxes = box.findElements(By.tagName("tr"));
	for(int i=1;i<boxes.size();i++) {
	List<WebElement> boxess = boxes.get(i).findElements(By.tagName("td"));
	if(boxess.get(1).getText().equals("143143")) {
		System.out.println("testpass");
	}
	else {
		System.out.println("test fail");
	}*/

		
	
		
	
	
	//List<WebElement> boxesses =  box.findElements(By.tagName("td"));
	/*System.out.println(boxes.size());
	System.out.println(boxesses.size());
	System.out.println(boxes.get(0).getText());
	System.out.println(boxesses.get(1).getText());
	System.out.println(boxesses.get(2).getText());
	System.out.println(boxesses.get(3).getText());
	for(WebElement x :boxes) {
		System.out.println(x.getText());
		
	}*/
	
	
	
	
	}
	
	}
	



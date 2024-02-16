package hari;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.xml.transform.Templates;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class immediatedelete {

	private static String[] temp;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("http://gmail.com");
		
	
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		/*WebElement Table =  driver.findElement(By.xpath("//*[@id=\"homepage-main-container\"]/div[2]/div[2]/div/div/div/div/div/table"));
		 List<WebElement> row =    Table.findElements(By.tagName("tr"));
		 
		   List<WebElement> col =  Table.findElements(By.tagName("td"));
		  for(WebElement x: row) {
			 System.out.println(x.getText());
		  }
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.manage().window().maximize();
/*driver.findElement(By.name("txtuId")).sendKeys("Admin");
driver.findElement(By.name("txtPword")).sendKeys("Admin");
driver.findElement(By.name("login")).click();
driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr/td[2]/a")).click();
  TakesScreenshot ts = (TakesScreenshot)driver;
  File a = ts.getScreenshotAs(OutputType.FILE);
  File b = new File("C:\\temp\\hari123.jpg");
  FileUtils.copyFile(a, b);*/
  
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*try {
			WebElement text =driver.findElement(By.linkText("demo"));
			text.isDisplayed();
			System.out.println("test passed");
			
		}
		catch(Exception e) {
			System.out.println("test failed");
			System.out.println(e.getMessage());
		}*/
		
		
	
		
		/*driver.findElement(By.linkText("Help")).click();
		String win = driver.getWindowHandle();
		Set<String> win1 = driver.getWindowHandles();

		System.out.println(win);
		System.out.println(win1);
		Object[] arr = win1.toArray();
		String a =arr[0].toString();
		String b =arr[1].toString();
		driver.switchTo().window(b);
		driver.findElement(By.linkText("Community")).click();*/
		
		//CDwindow-08E1AC982DE178D5AF7F71B97C10A504
	//	CDwindow-FAC4045588BC7D681B08FDE88A1E93B4
		
		
		

		/*driver.findElement(By.linkText("Help")).click();
		String win2 = driver.getWindowHandle();
		System.out.println(win2);
		Set<String> win1 = driver.getWindowHandles();
		System.out.println(win1);
		Object[]  har = win1.toArray();
		String hari = har[0].toString();
		String hare = har[1].toString();
		driver.switchTo().window(hare);
		driver.findElement(By.linkText("Community")).click();*/
		
		
		
		
		/*driver.manage().window().maximize();
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement srelement,trgelement;
		srelement =driver.findElement(By.id("draggable"));
		trgelement=driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(srelement, trgelement);
		act.build().perform();*/
		
		
		
	
		
		/*driver.findElement(By.id("onward_cal")).click();
		String calend = "Mar 2023";
	
		String motl = driver.findElement(By.className("monthTitle")).getText();
		while(!motl.equals(calend)) {
			driver.findElement(By.className("next")).click();
			motl = driver.findElement(By.className("monthTitle")).getText();
			
		}
		
		WebElement calendar =driver.findElement(By.xpath("/html/body/div[4]/table"));
		List<WebElement> rows = calendar.findElements(By.tagName("tr"));
		List<WebElement> cols = calendar.findElements(By.tagName("td"));
		String dt="27";
		for(WebElement x: cols) {
			if(x.getText().equals(dt)) {
				x.click();
				
			}*/
				
			
		//}
	/*	driver.findElement(By.id("src")).sendKeys("Kurnool");
		driver.findElement(By.id("dest")).sendKeys("Hyderabad");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		*/
		
		
		
		
		
		
		/*WebElement ek = driver.findElement(By.linkText("Home & Kitchen"));
		Actions cat = new Actions(driver);
		cat.moveToElement(ek);
		cat.contextClick();
		cat.build().perform();*/
		
		
		

		
		driver.manage().window().maximize();
		/*driver.findElement(By.name("email")).sendKeys("darahari217@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Harikrishna@1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("search-date")).click();
		String date ="4 May 2025";
		String[] temp = date.split(" ");
		String dt = temp[0];
		String mo = temp[1];
		String yr = temp[2];
		String a = driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!a.equals(yr)) {
			driver.findElement(By.linkText("Next")).click();
			a = driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		String b = driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!b.equals(mo)) {
			driver.findElement(By.linkText("Next")).click();
			 b = driver.findElement(By.className("ui-datepicker-month")).getText();	 
			
		}
		 WebElement table =  driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows =  table.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++) {
			List<WebElement> colu = rows.get(i).findElements(By.tagName("td"));
			for(WebElement x : colu) {
			if(x.getText().equals(dt)) {
				x.click();
			}
			}
			
		}*/
			
	}

	private static TakesScreenshot TakesScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}

package myPckg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHndling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver;
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();

		System.out.println("windowhandle are:"+handles);
		
		Iterator<String> it = handles.iterator();
		
		String parentwindowhandle = it.next();
		
		System.out.println("Parent window handle is:"+parentwindowhandle);
		
		
		String childwindowhandle = it.next();		
		System.out.println("Child window handle is:"+childwindowhandle);
		
		driver.switchTo().window(childwindowhandle);
		
		Thread.sleep(500);
		String title = driver.getTitle();
		System.out.println("Child window title is:"+title);
		driver.close();
		driver.switchTo().window(parentwindowhandle);
		Thread.sleep(500);
		System.out.println("Parent window title is:"+driver.getTitle());
	}

	public void test()
	{
		System.out.println("test method");
	}
	
}

package myPckg;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp2 {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				WebDriver driver;
				
				WebDriverManager.firefoxdriver().setup();
				
				driver = new FirefoxDriver();
				
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				Thread.sleep(1000);
				
				driver.findElement(By.name("proceed")).click();
				
				Thread.sleep(500);
				Alert al = driver.switchTo().alert();
				
				al.accept();
				

			}

		


	}


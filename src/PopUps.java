import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUps {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				WebDriver driver;
				
				WebDriverManager.chromedriver().setup();
				
				driver = new ChromeDriver();
				
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				
				driver.findElement(By.name("proceed")).click();
				
				Alert al = driver.switchTo().alert();
				
				al.accept();
				

			}

		


	}


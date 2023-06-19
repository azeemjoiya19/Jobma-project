import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Program1 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("azeem");
		driver.findElement(By.id("pass")).sendKeys("87654678");
		driver.findElement(By.name("login")).click();
		
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowserMarkAttendence {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://techindustan.in/pms/index.php/signin");

		driver.manage().window();

		Thread.sleep(1000);

	
        driver.findelement(by.name("email")).sendkeys("anshumannn@techindustan.com"); 
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("Password");
		
		driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[3]/div")).click();  //click verification box

		driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[4]/button")).click();  //click sign in

	}
}

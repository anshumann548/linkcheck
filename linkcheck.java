package mypro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		Robot robot = new Robot();

		String url = "http://trenddii-admin.s1.ths.agency/dashboard";

		driver.get(url); // to get on link
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("preetpal"); // username
		driver.findElement(By.id("password")).sendKeys("preetpal@123"); // password

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath(
				"//button[@class='MuiButtonBase-root MuiFab-root jss7 submit-btn MuiFab-extended MuiFab-primary']"))
				.click(); // for login button

		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[1]/div/header/div/div/div/label/span[1]/span[1]/span[1]/input"))
				.click(); // To change theme for dashboard

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Setting wala button code vich pauna baki hai
		// Dabbe de tin tin dot wale button code vich paune baki hann !

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/ul/div[2]/div[2]/span")).click(); // to open
																												// Topic

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/main/div[2]/div/main/div[1]/button/span[1]"))
				.click(); // to add Topic

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/main/div[2]/div[1]/div/div/input"))
				.sendKeys("Hallucination"); // to send keys into Topic

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/main/div[2]/div[2]/button")).click(); // to
																													// submit
																													// keys
																													// into
																													// Topic

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		try {
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

		} catch (Exception e) {
			System.out.print("Unable to Scroll down.. ");

		}
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div[2]/main/div/div/div[1]/table/tbody/tr[1]/td[3]/div/div"))
				.click(); // dialogue box for are you want to delete element
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/main/div[2]/div[2]/button")).click(); // To
																													// choose
																													// no
																													// from
																													// dialogue
																													// box
		Thread.sleep(3000);
		WebElement testDropDown = driver.findElement(By
				.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div[2]/main/div/div/div[2]/div/div[2]")); // To
		// open
		// pagination
		// drop
		// down
		Thread.sleep(3000);
		testDropDown.click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click(); // To select 25 per page row count
		Thread.sleep(3000);
		testDropDown.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click(); // To select 5 per page row count
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/ul/div[3]/div[2]/span")).click(); // Click
																												// on
																												// the
																												// users
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div[2]/main/div/div/div[2]/div"))
				.click(); // ...........................................//
		Thread.sleep(2000);
		WebElement testDropDown2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div[2]/main/div/div/div[2]/div/div[2]")); // To
		// open
		// pagination
		// menu
		Thread.sleep(2000);
		testDropDown2.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click(); // To select 25 per page row count
		Thread.sleep(3000);
		testDropDown2.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click(); // To select 5 per page row count
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div[2]/main/div/div/div[1]/table/tbody/tr[7]/td[7]/div/div[1]")).click();
		//(working on the view button)
		
		
		
		
		
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div[2]/main/div/div/div[1]/table/tbody/tr[1]/td[7]/div/div[2]"
		 * )).click(); //click on deactivator WebElement Deactivatorbox
		 * =driver.findElement(By.xpath(
		 * "/html/body/div[2]/div[3]/div/div[2]/div/main/div[2]/div/div/div/input"));//
		 * Box clicker Deactivatorbox.click(); Deactivatorbox.sendKeys("Malicious");
		 * //sending keys driver.findElement(By.xpath(
		 * "/html/body/div[2]/div[3]/div/div[2]/div/main/div[3]/div[1]")).click();
		 * //clicked on deactivate
		 */
try {
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

			System.out.println("HOLD TIGHT ! Hovering aboard Trenddii.. ");
		} catch (Exception e) {
			System.out.print("Unable to Scroll down.. " + e);
		}

		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/ul/div[4]/div[2]/span")).click(); // To open questions
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div/div/div/div/input")).sendKeys("Hello");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div")).click(); // ...........................................//
		Thread.sleep(2000);
		WebElement testDropDown3 = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div/main/div/div/div[2]/div/div[2]")); // To
		// open
		// pagination
		// menu
		testDropDown3.click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click(); // To select 25 per page row count
		Thread.sleep(3000);
		testDropDown3.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click(); // To select 5 per page row count
		Thread.sleep(2000); // Questions

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/ul/div[5]/div[2]/span")).click(); // to open
																												// Trending
																												// Questions
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div/div/div/div")).sendKeys("hello");
		
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div")).click(); // ...........................................//
		Thread.sleep(2000);
		WebElement testDropDown4 = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div/main/div/div/div[2]/div/div[2]")); // To
		// open
		// pagination
		// menu
		testDropDown4.click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click(); // To select 25 per page row count
		Thread.sleep(3000);
		testDropDown4.click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click(); // To select 5 per page row count
		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/ul/div[6]/div[2]/span")).click(); // to open
																												// popular
																												// questions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div")).click(); // ...........................................//
		Thread.sleep(2000);
		WebElement testDropDown5 = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div/main/div/div/div[2]/div/div[2]")); // To
		// open
		// pagination
		// menu
		testDropDown5.click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click(); // To select 25 per page row count
		Thread.sleep(3000);
		testDropDown5.click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click(); // To select 5 per page row count
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/ul/div[7]/div[2]/span")).click(); // to open
																												// group
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div")).click(); // ...........................................//
		Thread.sleep(2000);
		WebElement testDropDown6 = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div/div/div[2]/div/div[2]")); // To
		// open
		// pagination
		// menu
		testDropDown6.click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click(); // To select 25 per page row count
		Thread.sleep(3000);
		testDropDown6.click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click(); // To select 5 per page row count
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/ul/div[8]/div[2]/span")).click(); // to open
																												// hash
																												// tag
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div")).click(); // ...........................................//
		Thread.sleep(2000);
		WebElement testDropDown7 = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div/div/div[2]/div/div[2]")); // To
		// open
		// pagination
		// menu
		testDropDown7.click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click(); // To select 25 per page row count
		Thread.sleep(3000);
		testDropDown7.click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click(); // To select 5 per page row count
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/ul/div[9]/div[2]/span")).click(); // to open
																												// deactivated
																												// user
		Thread.sleep(2000);
		WebElement testDropDown8 = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div/main/div/div/div[2]/div/div[2]")); // To
		// open
		// pagination
		// menu
		testDropDown8.click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click(); // To select 25 per page row count
		Thread.sleep(3000);
		testDropDown8.click();
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click(); // To select 5 per page row count
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/ul/div[10]/div[2]/span")).click(); // to open
																												// notifications

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/ul/div[11]")).click(); // to open upload
																									// questions

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.quit();

	}

}
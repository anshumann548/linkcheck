package assesment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class asessment  
{
 public static void main(String args[]) throws InterruptedException	
{
	System.setProperty("webdriver.chrome.driver","/home/anshumann/Downloads/chromedriver.sh");
WebDriver driver = new ChromeDriver();
	String url = "https://www.flipkart.com/" ;
 driver.get(url);	
 driver.manage().window().maximize();
 driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
    Thread.sleep(3000);
 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Realme gt me");
    Thread.sleep(3000);
 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
    Thread.sleep(3000);
 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]")).click();
    Thread.sleep(2000);
    String myval = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]")).getText(); 

driver.quit();
System.out.print("");
System.out.print("");

    WebDriver driver2 = new ChromeDriver();
	String url2 = "https://www.amazon.com" ;
	driver2.get(url2);
	Thread.sleep(5000);
	driver2.findElement(By.xpath("//*[@id=\"nav-search\"]")).click();
	Thread.sleep(3000);
	driver2.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Realme gt me");
    Thread.sleep(6000);
 driver2.findElement(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div[1]/div")).click();
   Thread.sleep(3000);
 driver2.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span")).click();
    Thread.sleep(3000);
 driver2.findElement(By.xpath("//*[@id='icp-currency-dropdown-selected-item-prompt']/span/span/span")).click();
   Thread.sleep(2000);
   driver2.findElement(By.xpath("//*[@id=\"icp-currency-dropdown_44\"]")).click();
   Thread.sleep(2000);
   driver2.findElement(By.xpath("//*[@id=\"icp-save-button\"]/span/input\n")).click();
   Thread.sleep(2000);
   driver2.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
   Thread.sleep(2000);   
   String myval2 = driver2.findElement(By.xpath("//*[@id=\"corePrice_desktop\"]/div/table/tbody/tr/td[2]/span[1]/span[2]")).getText(); 

   Thread.sleep(2000);
   System.out.print("");   
String numberOnly2 = myval2.replaceAll("[^.0-9]", "");
System.out.println("Price by amazon by product"+" "+":"+" "+numberOnly2);
System.out.print("");
double number2 = Double.parseDouble(numberOnly2);
System.out.print("");
String numberOnly1 = myval.replaceAll("[^0-9]", "");
System.out.println("Price by flipkart for product"+" "+":"+" "+numberOnly1);
System.out.print("");
double number1 = Double.parseDouble(numberOnly1);
System.out.println("");
if(number2 < number1)
{
	System.out.print("Product by amazon is cheaper");
	}
else
{
	System.out.print("Product by flipkart is cheaper");
	}
	
}
}

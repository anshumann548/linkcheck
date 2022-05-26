package lnk;
  
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Iterator; 
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class lnk 
{
	public static void main(String args[]) throws IOException, InterruptedException

	{
	
	    String url = "";
		String currentlink= "";
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the link : ");
		url = scan.nextLine();
		scan.close();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window();
	    driver.findElement(By.tagName("a")).getAttribute("href");
        List<WebElement> links = driver.findElements(By.tagName("a"));
	    Iterator<WebElement> it = links.iterator();
	    
	    while(it.hasNext())
          {
           
	    	currentlink = it.next().getAttribute("href");
	    
	    	System.out.println(currentlink);
	    	if(currentlink == null || currentlink.isEmpty()) 
	    	{ 
	    		System.out.println("Unconfigured or empty");continue;
	    	}
	    	if(!currentlink.startsWith(url))
	    	    {
	    		 System.out.println("");
	    		 System.out.println("Another domain, skipping it."); continue;
	    		}

            var request = HttpRequest.newBuilder().uri(URI.create(currentlink)).build();
	        var client = HttpClient.newBuilder().build();
	        var response = client.send(request,HttpResponse.BodyHandlers.ofString());
	        
	        System.out.println("Status code" + "     " + ":"+" "+response.statusCode());
		    System.out.println("");      	  
          }		
        	   driver.quit();
	
	
	}
	
	
}

































/*
 * public class lnk {
 * 
 * private static WebDriver driver = null;
 * 
 * public static void main(String[] args) { String homePage =
 * "https://emerald-ems.com.au/";
 * 
 * String url = "";
 * 
 * HttpURLConnection huc = null;
 * 
 * int respCode = 200;
 * 
 * driver = new ChromeDriver();
 * 
 * driver.manage().window();
 * 
 * driver.get(homePage);
 * 
 * List<WebElement> links = driver.findElements(By.tagName("a"));
 * 
 * Iterator<WebElement> it = links.iterator();
 * 
 * while(it.hasNext()){
 * 
 * url = it.next().getAttribute("href");
 * 
 * System.out.println(url);
 *
 * if(url == null || url.isEmpty()) { System.out.
 * println("URL is either not configured for anchor tag or it is empty");
 * 
 * continue; }
 * 
 * if(!url.startsWith(homePage))
 * {
 * System.out.println("URL belongs to another domain, skipping it."); continue;
 * }
 * 
 * try { huc = (HttpURLConnection)(new URL(url).openConnection());
 * 
 * huc.setRequestMethod("HEAD");
 * 
 * huc.connect();
 * 
 * respCode = huc.getResponseCode();
 * 
 * if(respCode >399){ System.out.println(url+" Status code : Fault "); } else{
 * System.out.println(url+" Status : OK "); }
 * 
 * } catch (MalformedURLException e) { e.printStackTrace(); } catch (IOException
 * e) { System.out.print("exception thrown"); }
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 */
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

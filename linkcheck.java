import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
public class linkcheck
{
public static void main(String[] args) throws IOException ,InterruptedException 
	{
	
	Scanner headergetter =new Scanner(System.in);
	var url="";
	 
	System.out.println("Please enter the number of links you want to check : ");
	Scanner sc=new Scanner(System.in);  
       int n=sc.nextInt();  
   	int[] array = new int[n];  
   	  

	System.out.println("Please enter link you want to check : ");
	
	for(int i=0; i<n; i++)
		{
		Scanner scr =new Scanner(System.in);
        url = scr.nextLine();
	    var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).headers("authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInJvbGUiOiJhZG1pbiIsImlkIjoiNmRjZjNjZjMtYWRlMy00OWMyLThiOGUtMzk2MmE1MjM5MTNkIiwiaWF0IjoxNjUxMTI2OTM5LCJleHAiOjE2NTEyOTk3Mzl9.AXfzydVaJQEog2mWhziPHxhX6Qi9HZFkQ1rYFRklN0s").headers("method","GET").headers("accept-encoding", "gzip, deflate, br"
).headers("accept","accept: application/json, text/plain, */*").build();
        var client = HttpClient.newBuilder().build();
        var response = client.send(request,HttpResponse.BodyHandlers.ofString());
		
        System.out.println("");
              System.out.println("Server Response"+" "+":"+" "+((HttpResponse)response).body());    
                  System.out.println("Status code" + "     " + ":"+" "+response.statusCode());
		}
    }
}
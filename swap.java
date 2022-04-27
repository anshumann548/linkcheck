package ch2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swap extends Constants
{
	public static void main(String args[]) throws FileNotFoundException
{
		
		String pkey=" ";
		File file=new File("/home/jatin/Desktop/words.txt");
		Scanner scr =new Scanner(file); 
		scr.useDelimiter(" ");
		String cword =scr.next();
		scr.close();
  
       Scanner object = new Scanner(System.in);
		System.out.println(ANSI_BOLD+"Enter the sentence :"+ANSI_RESET );
		String names = object.nextLine(); 
        String name = names.replaceAll("( +)"," ").trim();
        String words[]= name.split(" "); 
          object.close();        
        
	    
		for( String s : words )
	    {
	    if(cword.contains(s))
	    {
 
	    	 pkey =pkey + " " +ANSI_GREEN+s+ANSI_RESET;	
	    }
	     else {	
	    
	    	 pkey= pkey + " " +ANSI_RED+s+ANSI_RESET;
	    	}
	    
	    }
		

     String ds = pkey.substring(0,1); 
     String jds=ds.toUpperCase();
     String rds = pkey.substring(1).toLowerCase();  
     String tds=jds.concat(rds);
     System.out.print(tds);;
	 
}
}



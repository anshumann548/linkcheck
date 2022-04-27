package ch2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class swap 
{
	public static void main(String args[]) throws FileNotFoundException
{
//		System.out.println("jhbdhkcbkdbckdbc");
		
//		  
//		  
//        Scanner object = new Scanner(System.in); // import scanner class
//		System.out.println("Enter the sentence :" ); // ask for the string
//		String names = object.nextLine(); //get the string
//		
//		
//		String name = names.replaceAll("( +)"," ").trim();
//		String words[]= name.split(" "); // split the string
//     	System.out.println("Enter your choice : To capitilize every first letter of world Enter all");
//     	System.out.println("Enter your choice : To capitilize first letter of sentence press any key");
//		Scanner sc = new Scanner(System.in);
//	    String c = sc.nextLine();
//	    
//			
//     	if(c.equals("all"))
//     	{
//     		for( String s : words)  //for each word (for each word of words array) 
//         	{
//     		 String ss = s.substring(0,1);  //get the substring first letter of the word
//         	   String rs = s.substring(1).toLowerCase();  //get the rest string and lower the letter case after 1st if is
//              	String js=ss.toUpperCase();  //convert the first letter to the upper case 
//              	String ts=js.concat(rs);//concatenate with rest letters
//              	System.out.print(" " + ts); // print the combined letters again
//         	}
//     	}
//     	
//     	else
//		{
//    		String ds = name.substring(0,1);  //get the substring first letter of the word
//     	    String rds = name.substring(1).toLowerCase();  //get the rest string and lower the letter case after 1st if is
//          	String jds=ds.toUpperCase();  //convert the first letter to the upper case 
//          	String tds=jds.concat(rds);//concatenate with rest letters
//          	System.out.print(" " + tds); 
//     
//     	}
		
    	 File file = new File("/home/jatin/Desktop/words.txt");
		  Scanner scr = new Scanner(file) ;
		
		try
		{
			System.out.println("Starting");
			
			Boolean size = scr.hasNext();
			
			System.out.println("Result: "+size);
			
			int i=0;
			
			
//			  scr.useDelimiter("\\Z");
//			System.out.println("File: "+scr.next());
			
			if(scr.hasNext())
			{
		      	  System.out.println(scr.next().toString()); 				
		      	  i++;
			}
			else
			{
				System.out.println("NO");
				i++;
			}
			
			
//			  scr.close();  	
	     	 System.out.println("Try");
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}     	 
		
	}
}



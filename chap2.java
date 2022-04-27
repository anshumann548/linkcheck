package ch2;

public class chap2 
{
	static int res=0;
	static String full_name=null;
	
	public static void Valid(String st , int u)
	{
	 
		 System.out.println(  st + " "  + "Seniors , No. of programs I have written is : " + );
	}
	
	public Integer sum (int a, int b)
	{
		res = a + b;
		return res;
	//System.out.println("result for sum of 2 numbers: " + res);
	
	}
	
	public void name(String first_name, String Last_name)
	{
		full_name = first_name + Last_name;
	}
	
	
	
		public static void main(String[] args)
		{
				chap2 vl = new chap2();
				
				Valid("Hi" , 5);
				vl.sum(5,5);
				vl.name("Anshumann", "Singh");
				System.out.println("Sum of 2 numbers is : " + res);
				System.out.println("Full name of the candidate is : " + full_name);
		}

	 
}
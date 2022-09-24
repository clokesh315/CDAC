import java.util.Scanner;

class q11
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three number:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		System.out.println();
		System.out.println("Smallest number:");
		if(a<b&&a<c)     
		{
				System.out.println(a);
		} 
		else if(b<c) 
		{
				System.out.println(b);
		}
		else
		{
				System.out.println(c);
		}
		
	}
	
}	
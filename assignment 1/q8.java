import java.util.Scanner;
class q8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		int digit=1;
		while(a>0){
			digit=a%10;
			System.out.println(digit);
			a=a/10;
		}
	}
}
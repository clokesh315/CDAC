import java.util.Scanner;
class q10{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		int digit=1;
		int sum=0;
		while(a>0){
			digit=a%10;
			a=a/10;
			sum=sum+digit;
		}
		System.out.println(sum);
	}
}
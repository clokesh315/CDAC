import java.util.Scanner;
class q13{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		int unit=1;
		int reverse=0;
		while(a>0){
			unit=a%10;
			reverse=reverse*10+unit;
			a=a/10;
		}
		System.out.println("Reverse:"+reverse);
	}
}
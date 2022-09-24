import java.util.Scanner;
class q2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		int fact=1;
		while(a>1){
			fact=fact*a;
			a--;
		}
		System.out.println(fact);
	}
}
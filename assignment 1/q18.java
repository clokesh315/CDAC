import java.util.Scanner;
class q18{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		System.out.println("Prime factors are:");
		for(int i=2;i<a;i++){
			while(a%i==0){
				System.out.println(i);
				a=a/i;
			}
		}
		if(a>2)
		System.out.println(a);
	}
}
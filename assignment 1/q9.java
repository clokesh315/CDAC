import java.util.Scanner;
class q9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		System.out.println("factors are:");
		for(int i=2;i<=a/2;i++){
			if(a%i==0){
				System.out.println(i);
			}
		}
	}
}
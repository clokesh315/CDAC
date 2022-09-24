import java.util.Scanner;
class q5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		if(a>0){
			System.out.println("positive");
		}
		else if(a<0){
			System.out.println("negative");
		}
		else{
			System.out.println("it is zero");
		}
	}
}
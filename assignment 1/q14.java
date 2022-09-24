import java.util.Scanner;
class q14{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int small;
		if(a<b){
			small=a;
		}
		else{
			small=b;
		}
		for(int i=small;i>=2;i--){
			if(a%i==0 && b%i==0){
				System.out.println(i);
				break;
			}
		}
	}
}
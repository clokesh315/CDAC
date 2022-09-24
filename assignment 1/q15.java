import java.util.Scanner;
class q15{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int big,small;
		if(a>b){
			big=a;small=b;
		}
		else{
			big=b;small=a;
		}
		int count=1;
		for(int i=big;true;i=big*count){
			if(i%small==0){
				System.out.println("LCM:"+i);
				break;
			}
			count++;
		}
	}
}
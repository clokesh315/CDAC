import java.util.Scanner;
class q6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int a = sc.nextInt();
		
		if(a%4==0){
			if(a%100==0){
				if(a%400==0){
					System.out.println("Leap year");
				}
				else{
					System.out.println("Not leap year");
				}
			}
			else{
				System.out.println("Leap year");
			}
		}
		else{
			System.out.println("Not leap year");
		}
		
		
	}
}
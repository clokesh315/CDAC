class p2{
	public static void main(String args[]){
		for(int i=2;i<=10;i=i+2){
			for(int k=10;k>i;k--){
				System.out.print(" ");
			}
			for(int j=2;j<=i;j=j+2){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
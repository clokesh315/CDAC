class p1{
	public static void main(String args[]){
		for(int i=0;i<=9;i++){
			for(int j=i;j<9;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
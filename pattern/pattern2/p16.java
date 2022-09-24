class p16{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			if(i==3){System.out.println("  * *");}
			if(i==4){System.out.println(" *  *");}
			if(i==3||i==4){
					continue;
				}
			for(int k=5;k>i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
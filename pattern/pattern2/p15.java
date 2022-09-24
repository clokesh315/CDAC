class p15{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			if(i==3){System.out.print("* *");}
			if(i==4){System.out.print("*  *");}
			for(int j=1;j<=i;j++){
				if(i==3||i==4){
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
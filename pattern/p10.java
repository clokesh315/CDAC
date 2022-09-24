class p10{
	public static void main(String args[]){
		for(char i='E';i>='A';i--){
			for(char k='A';k<i;k++){
				System.out.print(" ");
			}
			for(char j=i;j<='E';j++){
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}
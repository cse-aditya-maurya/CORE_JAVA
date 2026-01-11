class NumberDisplayer{
	public static void series(int s,int e){
		if(s<e){
			System.out.println("Forward Series...");
			for(int i=s;i<=e;i++){
				System.out.print(i + " ");
			}
		}
		if(s>e){
			System.out.println("Backward Series...");
			for(int i=s;i>=e;i--){
				System.out.print(i + " ");
			}
		}
	}
	public static void seriesChar(char s,char e){
		if(s<e){
			System.out.println("Forward Series...");
			for(char i=s;i<=e;i++){
				System.out.print(i + " ");
			}
		}
		else if(s>e){
			System.out.println("Backward Series...");
			for(char i=s;i>=e;i--){
				System.out.print(i + " ");
			}
		}
		else{
			System.out.println("Single Character "+s);
		}
	}
}
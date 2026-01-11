class ControlFlow{
	public static void main(String[] args) {
		boolean like=true;
		System.out.println("HEADER");
		if(like){
			System.out.print("LIKED");
		}
		System.out.println("FOOTER");
		int a=6;
		int b=9;
		if(a>b){System.out.println("a is greater");}
		else if(b>a){System.out.println("b is greater");}
		else{System.out.println("a and b are equal");}
	}
}
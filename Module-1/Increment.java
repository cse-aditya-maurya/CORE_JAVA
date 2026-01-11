class Increment{
	public static void main(String[] args) {
		int i=10;
		int j=20;
		int inc =++i - j++ + i++ - ++j;
		System.out.println(inc);
		System.out.println("i is "+i+"j is "+j);
		int x=34;
		int y=75;
		int dec= x-- + --y + --x + y--;
		System.out.println(dec);
		System.out.println("x is "+x+"y is "+y);
		boolean c=i<j;
		System.out.println(c);
		//ternary operator
		int r=i>j?i+j:x+y;
		System.out.println("ternary answer "+r);
		String str=x>y?"CPP":"JAVA";
		System.out.println("ternary answer language "+str);
	}
}
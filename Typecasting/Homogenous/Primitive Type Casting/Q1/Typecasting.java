class Typecasting {
	public static void widening(){
		 int i=10;
		 System.out.println("Value of i is: "+i);
		 double d=i;
		 System.out.println("Value of d is: "+d);
		 System.out.println();
	}
	public static void narrowing(){
		double d=12.45;
		System.out.println("Value of d is: "+d);
		int i=(int)d;
		System.out.println("Value of i is: "+i);
		System.out.println();
	}

}
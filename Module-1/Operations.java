class Operations{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;
		System.out.println("Operations "+" sum "+ sum + "....sub "+ sub + "...mul "+ mul+ "...div "+ div+ "...mod "+ mod);
		System.out.println(" ");
		a+=10;
		b-=10;
		System.out.println(a+" "+b);
		a*=10;
		b/=10;
		System.out.println(a+" "+b);
	}
}
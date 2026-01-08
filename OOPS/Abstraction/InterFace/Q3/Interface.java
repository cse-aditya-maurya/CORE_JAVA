interface Interface{
	public static void sm(){
		System.out.println("static sm() of interface Interface");
	}
	public default void nsm1(){
		System.out.println("non static nsm1() of interface Interface");
	}
	public void nsm2();
}

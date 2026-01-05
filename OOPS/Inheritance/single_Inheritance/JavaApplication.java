class JavaApplication {
	public static void execute(){
		System.out.println(Super.sv);
		Super.sm();
		Super sb=new Super();
		System.out.println(sb.nsv);
		sb.nsm();
		System.out.println();
		System.out.println(Sub.sv);
		Sub.sm();
		Sub ss=new Sub();
		System.out.println(ss.nsv);
		ss.nsm();
		

	}
}
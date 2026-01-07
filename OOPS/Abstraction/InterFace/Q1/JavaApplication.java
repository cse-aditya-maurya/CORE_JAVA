class JavaApplication {
	public static void execute(){
		System.out.println(SuperInterface.c);
		SuperInterface.sm();
		System.out.println();
        System.out.println(SubConcrete.c);
		SubConcrete ss=new SubConcrete();
		ss.nsm();

	}
}
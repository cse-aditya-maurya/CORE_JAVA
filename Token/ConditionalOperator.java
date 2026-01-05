class ConditionalOperator {
	public static void main(String[] args){
		int i=10;
		int j=5;
		System.out.println("content of i is : "+i);
		System.out.println("Content if j is: "+j);
		boolean c=i>j;
		int r=c?(i+j):(i*j);
		System.out.println("Res is: "+r);
		// Indirect utlization
		// String d=c?'J':"Python";
		// System.out.println(d);

		// Direct utilization
		System.out.println(c?'J':"python");


	}
}
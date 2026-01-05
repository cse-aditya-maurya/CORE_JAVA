class JavaApplication {
	public static void execute(){

		Test t1=new Test(1,"Raja","raja@gmail.com",1234567890l);
		System.out.println("Student "+t1);
		t1.displayStudentDetails();
		Test t2=new Test(2,"Rani","rani@gmail.com",1234167890l);
		System.out.println("Student "+t2);
		t2.displayStudentDetails();

	}
}  
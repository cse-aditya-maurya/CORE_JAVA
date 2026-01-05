class JavaApplication{
	public static void execute(){
		Student s=new Student(101,"Mayank bhai","mayankbhai@gmail.com",112l);
		s.displayStudentInfo();
		// s.id=2;      //compile time error
	}
}
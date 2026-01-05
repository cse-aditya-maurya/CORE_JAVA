
class JavaApplication{
	public static void execute(){
		Student.city="Jalandhar";
		Student.state="Punjab";
		Student.country="India";
		Student student1=new Student();
		student1.id=1;
		student1.name="saka";
		student1.mailId="saka@gmail.com";
		student1.contactNumber=9876543210l;

		student1.displayStudentDetails(); 

		Student student2=new Student();
		student2.id=2;
		student2.name="rani";
		student2.mailId="rani@gmail.com";
		student2.contactNumber=9876543211l;
		
		student2.displayStudentDetails();

	}
}
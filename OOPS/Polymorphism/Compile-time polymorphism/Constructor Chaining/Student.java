import java.lang.Object;
class Student extends Object{
	String name;
	char gender;
	String mailId;
	String dob;
	long contactNumber;
	Student(String name,char gender,String dob){
		super();
		this.name=name;
		this.gender=gender;
		this.dob=dob;
	}
	Student(String name,char gender,String dob,String mailId){
		// this.name=name;
		// this.gender=gender;
		// this.dob=dob;
		this(name,gender,dob);
		this.mailId=mailId;
	}
	Student(String name,char gender,String dob,String mailId,long contactNumber){
		// this.name=name; 
		// this.gender=gender;
		// this.dob=dob;
		// this.mailId=mailId;
		this(name,gender,dob,mailId);
		this.contactNumber=contactNumber;
	}
	public void displayStudent(){
		System.out.println("Student Info ");
		System.out.println("---------------");
		System.out.println("Student name is: "+name);
		System.out.println("Student gender is: "+gender);
		System.out.println("Student DOB is: "+dob);
		System.out.println("Student Mail Id is: "+mailId);
		System.out.println("Student Contact Number is: "+contactNumber);
		System.out.println();
	}
}
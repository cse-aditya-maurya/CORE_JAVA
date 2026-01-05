class Test {
	int id;
	String name;
	String mailId;
	long contactNumber;
	Test(int id,String name,String mailId,long contactNumber){
		this.id=id;
		this.name=name;
		this.mailId=mailId;
		this.contactNumber=contactNumber;

	}
	

	 public void displayStudentDetails(){
          System.out.println("Student Details: ");
          System.out.println("----------------");
          System.out.println("Id: "+ id);
          System.out.println("Name: "+name);
          System.out.println("Mail id: "+mailId);
          System.out.println("Contact Number: "+contactNumber);



	 }

}
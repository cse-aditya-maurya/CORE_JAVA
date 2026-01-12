class NonPrimitiveSoftwareEngineer extends NonPrimitiveEmployee{
	static{
		city="Jalandhar";
	}
	String designation;
	int salary;
	public void task(){
		System.out.println("Task is Software Engineering");
	}
	public void display(){
		System.out.println("Id: "+id);
		System.out.println("name: "+name);
		System.out.println("contact: "+contactNumber);
		System.out.println("city: "+city);
		System.out.println("designation: "+designation);
		System.out.println("salary: "+salary);
		System.out.println();
	}
}
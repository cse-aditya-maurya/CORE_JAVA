class NonPrimitiveTypecasting{
	public static void UpcastingDowncasting(){
	NonPrimitiveEmployee employee;
	employee=new NonPrimitiveSoftwareEngineer();  //upcasting
	employee.entry();
	employee.meeting();
	employee.exit();
	
	NonPrimitiveSoftwareEngineer SDE=(NonPrimitiveSoftwareEngineer)employee;  //downcasting
	SDE.task();
	SDE.display();
    }
}
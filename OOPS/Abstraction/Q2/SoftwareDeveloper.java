class SoftwareDeveloper extends Employee {
	String designation;
	double salary;
	String role;
	double incentive;
	static String branch;
	static String department;
	static String company;
	static {
		city="Jalandhar";
		state="Punjab";
		country="India";
		branch="Amritsar";
		department="SoftwareDevelopement";
		company="capgemini";
	}
	SoftwareDeveloper(
  int id,String name,String mailId,long contactNumber,String designation,
    double salary,String role,double incentive
	){
		super(id,name,mailId,contactNumber);
		this.designation=designation;
		this.salary=salary;
		this.role=role;
		this.incentive=incentive;
	}
	@Override
	public void reverseKt(){
		System.out.println("Explantion about latest SoftwareDevelopment Tool");
	}
	@Override
	public void task(){
		System.out.println("Software Development");
	}
	@Override
	public void employeeInfo(){
	System.out.println("Employee info");
	System.out.println("---------------");
	System.out.println("Name:"+super.name);
	System.out.println("Id : "+super.id);
	System.out.println("Mail id:"+super.mailId);
	System.out.println("Role is: "+this.role);
	System.out.println("designation is: "+designation);
	System.out.println("Salary is: "+this.salary);	
	System.out.println("City is : "+super.city);
	System.out.println("State is : "+super.state);
	System.out.println("Country is : "+super.country);
	System.out.println("Branch is: "+this.branch);
	System.out.println("Department in: "+this.country);
	System.out.println("Company is: "+this.company);
	System.out.println();
	}
}
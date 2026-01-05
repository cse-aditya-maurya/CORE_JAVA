import java.util.Scanner;
public  class Student{
	Scanner sc=new Scanner(System.in);
	/*
	private int id;
	private String name;
	public int getId(){
		return id;
	}  
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name; 
	}
	*/

	private int empId;
	private String empName;

	public int getEmpId(){
		return empId;
	}

	public String getEmpName(){
		return empName;
	}

	public void setEmpId(int empId){
		this.empId = empId;
	}

	public void setEmpName(String empName){
		this.empName = empName;
	}

	public void displayDetails(){
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
	}

	public void input(Scanner sc){
		System.out.print("Enter id: ");
		empId = sc.nextInt();
		sc.nextLine();          
		System.out.print("Enter Name: ");
		empName = sc.nextLine();
	}

	public void setDetails(){
		System.out.print("Enter updated Details: ");
		empId = sc.nextInt();

		sc.nextLine();           
		System.out.println("Enter update name: ");
		empName = sc.nextLine();
		setEmpId(empId); 
		setEmpName(empName);
	 }
}

import java.util.Scanner;
class JavaApplication {
	static Student s=null;
	static Scanner sc=new Scanner(System.in);
	public static void execution(){
		
		
		/*System.out.println(s.getId());
		System.out.println(s.getName());
		s.setId(1);
		s.setName("Rajan");

        System.out.println(s.getId());
		System.out.println(s.getName());
*/
		while(true){
			System.out.println("---------------------");
			System.out.println("1). Create");
			System.out.println("2) Insert");
			System.out.println("3) Read");
			System.out.println("4. Update");
			System.out.println("5. Delete");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice");

			int choice = sc.nextInt();
			sc.nextLine();   // 🔥 important to clear buffer

			switch(choice){

			case 1:{
				s = new Student();     // 🔥 removed local variable
				System.out.println("object is created");
				break;
			}

			case 2:{
				System.out.println("Inserting Student (same as create)...");
				s = new Student();
				s.input(sc);
				System.out.println("Student Inserted!");
				break;
			}

			case 3:{
				System.out.println("Data of Employee is: ");
				s.displayDetails();
				break;
			}

			case 4:{
				System.out.println("Employee data is updated");
				s.setDetails();
				break;
			}

			case 5:{
				s=null;
				System.out.println("Data deleted successfully");
				break;
			}

			case 6:{
				System.out.println("Exit");
				return;
			}

			default:{
				System.out.println("Invliad input");
			}
			}
}
	}
}
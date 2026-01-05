import java.util.*;

class JavaApplication {

    static Student student = null;
    static Scanner sc = new Scanner(System.in);

    public static void execution(){

        while(true){
            System.out.println("\n--- STUDENT CRUD MENU ---");
            System.out.println("1) Create Student");
            System.out.println("2) Insert Student");
            System.out.println("3) Read Student");
            System.out.println("4) Update Student");
            System.out.println("5) Delete Student");
            System.out.println("6) Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1:
                
                    System.out.println("Creating Student...");
                     student = new Student();
                    
                   
                    break;

                case 2:
                    System.out.println("Inserting Student (same as create)...");
                    student = new Student();
                    student.input(sc);
                    System.out.println("Student Inserted!");
                    break;

                case 3:
                    if(student == null)
                        System.out.println("No Student Record Found!");
                    else
                        student.read();


                    break;

                case 4:
                    if(student == null) 
                        System.out.println("No Student To Update!");
                    else {
                        System.out.println("Enter New Details:");
                        student.input(sc);
                        System.out.println("Student Updated!");
                    }
                    break;

                case 5: 
                    if(student == null)
                        System.out.println("Nothing To Delete!");
                    else {
                        student = null;
                        System.out.println("Student Deleted!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}

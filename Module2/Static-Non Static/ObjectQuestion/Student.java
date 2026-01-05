/*
WAP: 
performing CIRUD operations  of student class object
i)create Student
ii)insert Student 
iii)Read student 
iv)update student 
v)delete student 
vi)exit
*/

/*
WAP: to display the multiplication for the given integer type input
WAP: to disply the multiplication in forward and backword series of even and odd numbers respectively for 
     given integer type input
WAP:
*/
import java.util.*;

class Student {
    int studentId;
    String name;
    int age;
    long contactNumber;

    public void input(Scanner sc){
        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.print("Enter Contact Number: ");
        contactNumber = sc.nextLong();
    }

    public void read(){
        System.out.println("Student Details");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contactNumber);
    }
}

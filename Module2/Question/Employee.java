
/*
  WAP create a class employee find variable and method

 id,name,mailId,contactNumber ,adharNumber,panNumber,Dob,Age,Gender
 Martial Status , company,branch,department,reporting manager,desination,role,salary,uanNumber,yearOfExp,
 city,state,country
 i)displayEmployeeDetails()
ii)Entry() 
ii)login()
iii)shortBreak()
iv)task()
v)taskUpdate()
vi)meeting()
vii)reverseKt()
viii)longBreak()
ix)logout
x) exit()

write a java program to create a class by name java application and create 4 employee class type obj 
then intilize all the variable and call all the method 
*/

public class Employee {

    // ----------- Variables (PUBLIC) ------------
     int id;
     String name;
     String mailId;
      String contactNumber;
      String adharNumber;
      String panNumber;
      String dob;
      int age;
      String gender;
      String maritalStatus;

     String company;
     String branch;
     String department;
     String reportingManager;
     String designation;
     String role;
     double salary;
     String uanNumber;
     int yearOfExp;

    static String city;
    static String state;
    static String country;

    // -------- Methods -----------
    public void displayEmployeeDetails() {
        System.out.println("\n----------- EMPLOYEE DETAILS -----------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + mailId);
        System.out.println("Contact: " + contactNumber);
        System.out.println("Aadhar: " + adharNumber);
        System.out.println("PAN: " + panNumber);
        System.out.println("DOB: " + dob);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Marital Status: " + maritalStatus);
        System.out.println("Company: " + company);
        System.out.println("Branch: " + branch);
        System.out.println("Department: " + department);
        System.out.println("Reporting Manager: " + reportingManager);
        System.out.println("Designation: " + designation);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
        System.out.println("UAN Number: " + uanNumber);
        System.out.println("Experience: " + yearOfExp + " Years");
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("----------------------------------------");
    }

    public void entry() { 
    	System.out.println(name + " entered office."); 
    }
    public void login() { 
    	System.out.println(name + " logged in.");
    	 }
    public void shortBreak() { 
    	System.out.println(name + " is on short break.");
    	 }
    public void task() { 
    	System.out.println(name + " started task.");
    	 }
    public void taskUpdate() { 
    	System.out.println(name + " updated task.");
     }
    public void meeting() { 
    	System.out.println(name + " joined meeting.");
    	 }
    public void reverseKt() { 
    	System.out.println(name + " is giving Reverse KT."); 
       }

    public void longBreak() { 
    	System.out.println(name + " is on long break."); 
       }
 
    public void logout() { 
    	System.out.println(name + " logged out.");                               
       }

    public void exit() { 
    	System.out.println(name + " exited office."); 
       }

}



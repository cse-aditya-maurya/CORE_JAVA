public class JavaApplication {

    public static void runApplication() {

        Employee e1 = new Employee();
        Employee.city="Mumbai";
        Employee.state="Maharashtra";
        Employee.country="India";
        e1.id = 101;
        e1.name = "Amit Sharma";
        e1.mailId = "amit@gmail.com";
        e1.contactNumber = "9876543210";
        e1.adharNumber = "1234-5678-9000";
        e1.panNumber = "ASDFP1234K";
        e1.dob = "10-02-1998";
        e1.age = 27;             
        e1.branch = "Mumbai";
        e1.department = "IT";
        e1.reportingManager = "Rahul Verma";
        e1.designation = "Software Engineer";
        e1.role = "Devel oper";
        e1.salary = 75000;
        e1.uanNumber = "UAN1234567";
        e1.yearOfExp = 4;
        // e1.city = "Mumbai";
        // e1.state = "Maharashtra";
        // e1.country = "India";

        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();

        e1.displayEmployeeDetails();
        e1.entry();
        e1.login();
        e1.task();
        e1.meeting();
        e1.taskUpdate();
        e1.shortBreak();
        e1.longBreak();
        e1.logout();
        e1.exit();
    }
}

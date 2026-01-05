class Student {
    int studentId;
    String name;
    String mailId;
    long contactNumber;
    {
        studentId=1;
        name="Rani";
        mailId="rani@gmail.com";
        contactNumber=9876543210l;

    }
    static String city;
    static String state;
    static String country;
    static {
        city="Banaras";
        state="Uttar Pradesh";
        country="India";
    }

    public void display(){
         System.out.println("Student Details");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + mailId);
        System.out.println("Contact: " + contactNumber);
    }

}

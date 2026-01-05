class JavaApplication {
	public static void execute(){
		Person pp=new Person("Rohan",15);
		System.out.println("Name of Person is: "+pp.getName());
		System.out.println("Age of Person is: "+pp.getAge());
		pp.setName("Rohit");
		pp.setAge(12);
		System.out.println("Name of Person is: "+pp.getName());
		System.out.println("Age of Person is: "+pp.getAge());
	}
}
class JavaApplication {
	 public static void execution(){
	 	Student s=new Student(101,"Rohan","rohan@gmail.com",9876543210l);
	 	s.displayStudentInfo();
	 	Project project=new Project(101,"Facial Attendence","Python based Application");
	 	s.createProject(project);
	 	// s.readProject();
	 	// s.updateProject(101,"E commerce","Java Based Algortihm");
	 	// s.readProject();
	 	s.deleteProject(101);
	 	s.readProject();
	 }
}
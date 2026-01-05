class MySql extends DataBase{
     public void displayMYSQLDBInfo(){
     	System.out.println("MySQL info");
		System.out.println("---------------");
		System.out.println("url : "+url);
		System.out.println("Username : "+username);
		System.out.println("Password: "+password);
		System.out.println();
     }
     public void crudOperation(){
		System.out.println("Program Generated Quries");
	}
}
class Oracle extends DataBase {
	public void displayOracleDBInfo(){
		System.out.println("Oracle DB info");
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
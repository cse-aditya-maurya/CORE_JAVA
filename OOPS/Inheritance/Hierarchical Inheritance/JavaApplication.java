class JavaApplication {
	public static void execute(){
		Oracle oracle =new Oracle();
		oracle.url="https.oracleDB.com";
		oracle.username="oracle_User";
		oracle.password="oracle@123";
		oracle.displayOracleDBInfo();
		oracle.connection();
		oracle.crudOperation();
		oracle.disconnection();

		MySql mysql =new MySql();
		mysql.url="https.MySQlDB.com";
		mysql.username="mysql_User";
		mysql.password="mysql@123";
		mysql.displayMYSQLDBInfo();
		mysql.connection();
		mysql.crudOperation();
		mysql.disconnection();
	}


}
class JavaApplication {
	public static void execute(){
		FraudCheck fraudCheck=new FraudCheck(false);
		Transaction transaction=new Transaction(5000,fraudCheck);
		Account acc=new Account(10000,transaction);
		acc.withdraw();
	}
}
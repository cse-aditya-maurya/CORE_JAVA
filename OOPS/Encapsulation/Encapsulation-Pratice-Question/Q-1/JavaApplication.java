class JavaApplication{
	public static void execute(){
		BankAccount bb=new BankAccount(1000);
		bb.deposite(500.00);
		bb.withdraw(500);
		System.out.println(bb.getBalance());
	}
}
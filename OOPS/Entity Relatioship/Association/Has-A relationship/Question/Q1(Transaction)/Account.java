class Account {
	int balance;
	Transaction transaction;
	Account(int balance,Transaction transaction){
		this.balance=balance;
		this.transaction=transaction;
	}
	public void withdraw(){
		if(transaction.isApproved(balance)){
			balance-=transaction.amount;
			System.out.println("withdraw successfull");
		}
		else{
			System.out.println("Withdraw fail");
		}
	}
}
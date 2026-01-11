class Transaction {
	int amount;
	FraudCheck fraudCheck;
	Transaction(int amount,FraudCheck fraudCheck){
		this.amount=amount;
		this.fraudCheck=fraudCheck;
	}
	public boolean isApproved(int balance){
		return balance>=amount && fraudCheck.isSafe();   
	}
}
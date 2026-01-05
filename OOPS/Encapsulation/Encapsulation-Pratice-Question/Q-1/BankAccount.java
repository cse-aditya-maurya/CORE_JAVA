// Q1. Bank Account Balance Protection
// Problem Statement

// Create a class BankAccount with a private variable balance.
// Allow balance modification only through deposit() and withdraw() methods.

// Withdrawal should occur only if the amount is less than or equal to balance.

// Input Type

// First line: Deposit amount (double)

// Second line: Withdraw amount (double)


class BankAccount{
	private double balance;
	BankAccount(int balance){
		this.balance=balance;
	}
	public void deposite(double amount){
		if(amount>0){
			System.out.println("Balance is: "+balance);
			System.out.println("Deposit Amount is: "+amount);
			System.out.println("Total Amount is: "+(balance+amount));
			balance+=amount;
		}
		else{
			System.out.println("Enter valid amount deposite amount should be greater than 0");

		}  
		System.out.println();
	}

		public void withdraw(double amount){
			if(balance>=amount){
				System.out.println("Balance is: "+balance);
				System.out.println("withdraw Amount is: "+amount);
				System.out.println("Remaining amount is: "+(balance-amount));
				// System.out.println("balance is"+balance+" withdraw amount "+amount+" remaning "+balance-amount);
				balance-=amount;

			}
			else{
				System.out.println("Insufficient amount");
			}
			System.out.println();
	}
	public double getBalance(){
       System.out.print("Final Balance is: ");
		return balance;
	}
}
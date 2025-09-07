package OOPs_testing;
abstract class BankAccounts{
	private double balance;
	BankAccounts(double Ebalance){
		balance=Ebalance;
		System.out.println("Initial Ammout is: "+ Ebalance);
	}
	abstract void withdraw(double amount);
	void deposit(double amount) {
		if (amount >0) {
	balance += amount;
	System.out.println("Ammount Deposit is: "+ amount);}
	else {
		System.out.println("Ammount entered is Invalid");
	
	}}
	 double  getBalance() {
		return balance;
	}
	 protected void setBalance(double Balance) {
		 this.balance=Balance;
	 }
}
class SavingsAccounts extends BankAccounts{
	SavingsAccounts(double initialBalance){
		super(initialBalance);
	}
	public void withdraw(double amount) {
		if (amount <= getBalance()) {
			setBalance(getBalance()-amount);
			System.out.println("withdraw is: "+ amount);
		}
		else {
			System.out.println("Insufficient balance");
			}
	}
}
public class abstractionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccounts b1= new SavingsAccounts(50000);
		b1.deposit(-50);
		b1.withdraw(80000);
		System.out.println("Total balance is: "+ b1.getBalance());

	}

}

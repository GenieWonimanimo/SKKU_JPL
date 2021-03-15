class BankAccount {
	private String fName;
	private String lName;
	private double balance;
	
	public BankAccount(String fName, String lName, double balance) {
		this.fName = fName;
		this.lName = lName;
		this.balance = balance;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		System.out.println(fName + " " + lName + " withdrew $" + amount);
		if (balance < amount) { // user can't withdraw money exceeding balance
			System.out.println("Failed. Withdrawal amount exceeded account balance.");
			return;
		}
		balance -= amount;
		System.out.println("Success.");
	}
	public void transfer(BankAccount receiver, double amount) {
		System.out.println(fName + " " + lName + " transferred $" + amount + " to " + receiver.getfName() + " " + receiver.getlName());
		if (balance < amount) { // user can't transfer money exceeding balance
			System.out.println("Failed. You have not enough money!");
			return;
		}
		balance -= amount;
		receiver.setBalance(receiver.getBalance() + amount); // receiver's balance should increase
		System.out.println("Success.");
	}
	
	public void printInfo() {
		System.out.println(fName + " " + lName + "'s balance: $" + balance);
	}
}

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount John = new BankAccount("John", "Ewing", 14000);
		BankAccount Jack = new BankAccount("Jack", "Sparrow", 100000);
		
		System.out.println("Balance ->");
		John.printInfo();
		Jack.printInfo();
		
		System.out.println("Operation ->");
		John.withdraw(2000);
		System.out.println("Balance ->");
		John.printInfo();
		Jack.printInfo();
		
		System.out.println("Operation ->");
		Jack.transfer(John, 50000);
		System.out.println("Balance ->");
		John.printInfo();
		Jack.printInfo();
		
		System.out.println("Operation ->");
		Jack.withdraw(60000);
		System.out.println("Balance ->");
		John.printInfo();
		Jack.printInfo();
		
		System.out.println("Operation ->");
		Jack.transfer(John, 55000);
		System.out.println("Balance ->");
		John.printInfo();
		Jack.printInfo();
	}

}

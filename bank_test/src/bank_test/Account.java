package bank_test;
class BankAccount{
	int acNo;
	String acName,acPhone,acEmail;
	double acBal;
	public BankAccount(int acNo, String acName, String acPhone, String acEmail, double acBal)
	{
		this.acNo=acNo;
		this.acName=acName;
		this.acPhone=acPhone;
		this.acEmail=acEmail;
		this.acBal=acBal;
	
	}
	public void accountholder() {
		System.out.println("Account Number:"+acNo);
		System.out.println("Account Holder Name: "+acName);
		System.out.println("Account Holder Address: "+acPhone);
		System.out.println("Account Holder Email: "+acEmail);
		System.out.println("Account Holder Balance: "+acBal);
	}
	public void deposit(double amount) {
		acBal+= amount;
		System.out.println("Deposited: $"+amount);
	}
	public void displayBalance() {
		System.out.println("Account Number:"+acNo+"\t"+"Balance: $"+acBal);
	}
}
class SavingsAccount extends BankAccount{
	public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double acBal) {
		super(acNo, acName,acPhone,acEmail,acBal);
	}
}
class CurrentAccount extends BankAccount{
	public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double acBal) {
		super(acNo, acName,acPhone,acEmail,acBal);
	}
}
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("SAVINGS ACCOUNT DETAILS");
	SavingsAccount sac =new SavingsAccount(1001,"Ann Kamau","07200000","test@gmail.com",1000);
	sac.accountholder();
	sac.deposit(500);
	sac.displayBalance();
	System.out.println("");
	System.out.println("CURRENT ACCOUNT DETAILS");
	CurrentAccount cua =new CurrentAccount(1001,"Peter Smith","08100000","admin@gmail.com",0.0);
	cua.accountholder();
	cua.deposit(300);
	cua.displayBalance();
	}

}

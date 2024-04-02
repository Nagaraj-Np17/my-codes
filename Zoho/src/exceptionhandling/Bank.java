package exceptionhandling;
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
class BankATM {
	private String bankName;
	private String bankNumber;
	private long balance =10000;
	public BankATM(String bankName, String bankNumber) {
		super();
		this.bankName = bankName;
		this.bankNumber = bankNumber;
		
	}
	public String getBankName() {
		return bankName;
	}
	public String getBankNumber() {
		return bankNumber;
	}
	public long getBalance() {
		return balance;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}
	
	public void deposit(long addMoney) {
		balance=balance+addMoney;
		
	}
	public void withdraw(long withdrawMoney) {
		try {
			if(balance-withdrawMoney<=0) {
				throw new InsufficientBalanceException("InsufficientBalance..");
			}else {
				System.out.println("Withdraw SuccesFull");
				balance-=withdrawMoney;
				System.out.println("Balance Amount"+balance);
			}
			
		}catch(InsufficientBalanceException e) {
			System.out.println(e);
			System.out.println("Maintain Minimum Balance..");
			System.out.println("You can Withdraw only "+balance+" rs");
		}
		
	}
	
	
	
}


public class Bank {
public static void main(String[] args) {
	BankATM atm=new BankATM("IndianBank","0987654323");
	atm.deposit(100);
	System.out.println(atm.getBalance());
	atm.withdraw(10);
}
}

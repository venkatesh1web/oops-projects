package bankaccountapp;

public abstract class Account implements IBaseRate {
	
//	list common properties for savings and checking accounts
	private String name;
	private String sSN;
	private double balance;
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	
//	constructor to set base properties and initialize the account.
    public Account(String name,String sSN,double initdeposit) {
		this.name = name;
		this.sSN = sSN;
		this.balance = initdeposit;
		
		
//		set account number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
    
    public abstract void setRate();
    
    private String setAccountNumber() {
    	String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
    	int uniqueID = index;
    	int randomNumber = (int)(Math.random()*Math.pow(10, 3));
    	return lastTwoOfSSN + uniqueID + randomNumber;
    }
    
    public void compound() {
    	double accuredInterest = balance * (rate/100);
    	balance = balance + accuredInterest;
    	System.out.println("AccuredInterest: "+ accuredInterest);
    	printBalance();
    }
	
//	list common methods
    public void deposit(double amount) {
    	balance = balance + amount;
    	System.out.println("depositing "+amount);
    }
    public void withdraw(double amount) {
    	balance = balance - amount;
    	System.out.println("withdrawing "+ amount);
    }
    public void transfer(String toWhere,double amount) {
    	System.out.println("transferring"+amount+"to"+ toWhere);
    	printBalance();
    }
    public void printBalance() {
    	System.out.println("your balance is now "+ balance);
    }
    
    public void showInfo() {
    	System.out.println(
    	"NAME: " + name +
    	"\nACCOUNT NUMBER: "+ accountNumber +
    	"\nBALANCE: "+ balance+
    	"\nRATE: " + rate+"%"
        );
    }

}

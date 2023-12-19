package bankaccountapp;

public class Checking extends Account {
	
//	List properties specific to a checking account
	private long debitCardNumber;
	private int debitCardPin;
	
//	constructor to initialize checking account properties
	public Checking(String name,String sSN,double initdeposit) {
		super(name,sSN,initdeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
		
	}
	@Override
	public void setRate() {
		rate = getBaseRate()*0.15;
	}
	
	private void setDebitCard() {
		debitCardNumber =(long)(Math.random()* Math.pow(10, 12));
		debitCardPin = (int)(Math.random()* Math.pow(10, 4));
	}
	
//	List any method specific to the checking account
	 public void showInfo() {
		 System.out.println("checking account");
		 super.showInfo();
		 System.out.println("Your checking account features:"+
		         "\n debitCardNumber:"+debitCardNumber+
				 "\n debitCardPin:"+debitCardPin
				 );
		 
	 }
}

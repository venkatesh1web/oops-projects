package bankaccountapp;

public class Savings extends Account {
	
//	List properties specific to the savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
//	constructor to initialize settings for the savings account
	public Savings(String name,String sSN,double initdeposit) {
		super(name,sSN,initdeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		
	}
	@Override
	public void setRate() {
		rate = getBaseRate()-0.25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random()*Math.pow(10, 4));
		
	}
	
//	List any methods specific to the savings account
	 public void showInfo() {
		 System.out.println("savings account");
		 super.showInfo();
		 System.out.println("Your savings account features:"+
		         "\n safety deposit box id:"+safetyDepositBoxID+
				 "\n safety deposit box key:"+safetyDepositBoxKey
				 );
		
	 }
}

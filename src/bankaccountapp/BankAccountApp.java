package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		
		String file = "C:/Users/venka/Downloads/NewBankAccounts.txt";
//		Read a csv file and then create accounts based on that data
		List<String[]> newAccHolders = utilities.CSV.read(file);

	    for (String[] accHolder : newAccHolders) {
	        System.out.println("New Account");
	        
	        // Check the length of the array before accessing elements
	        if (accHolder.length >= 4) {
	            System.out.println("Name: " + accHolder[0]);
	            System.out.println("Account Number: " + accHolder[1]);
	            System.out.println("Account Type: " + accHolder[2]);
	            System.out.println("Balance: " + accHolder[3]);
	        } else {
	            System.out.println("Invalid data format for an account.");
	        }
	        String AccountType = accHolder[2];
	        String name = accHolder[0];
            String sSN = accHolder[1];
            double balance = Double.parseDouble(accHolder[3]);
			if(AccountType.equals("Savings")) {
		         System.out.println("open savings account");
		         accounts.add(new Savings(name,sSN,balance));
	        }else if (AccountType.equals("Checking")){
            	  System.out.println("open checking account");
            	  accounts.add(new Checking(name,sSN,balance));
              }else {
            	  System.out.println("error reading account type");
              }

}
	   for(Account acc : accounts) {
		   System.out.println("\n************************");
		   acc.showInfo();
	   }
}
}

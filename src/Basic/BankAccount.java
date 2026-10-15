package Oops;

public class BankAccount {
	double balance=5000;
	double withdraw(double amount) throws InsufficientbalanceException {
				if(amount>balance && amount>0) {
					  throw new  InsufficientbalanceException("Amount should be greater than balance"); 
				
				}
				else {
					balance-=amount;
					
				}
				return balance;
		
	}
	public static void main(String[] args)  {
		BankAccount b=new BankAccount();
		try {
			
		double rem=b.withdraw(200000);
		System.out.println(b.balance);
		}
		catch(InsufficientbalanceException e) {
			System.out.println(e.getMessage());
			System.out.println("Current"+b.balance);
		}
		
	}

}

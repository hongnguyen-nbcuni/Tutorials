public class Main04_02 {
	
    public static void main(String[] args) {
    	
        BankAccount myBankAccount = new BankAccount(4141,
                100);
        // only can access bank_account / bank_balance through 
        // the methods deposit/withdraw (indirect way)
        
        // System.out.println(myBankAccount.bank_account); 

        myBankAccount.deposit(-60);	// public method
        myBankAccount.withdraw(150); // public method

        myBankAccount.deposit(100);
        myBankAccount.withdraw(200);

    }

}


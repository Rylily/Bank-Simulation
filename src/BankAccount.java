public class BankAccount {
    private double Balance;
    private int AccountNumber;


    public BankAccount(int AccountNumber) {
        this.AccountNumber = AccountNumber;
        this.Balance = 0;
    }

    public void display() {
        System.out.println("Balance: " + Balance);
    }


    public void deposit(double DepositAmount) {
        if (DepositAmount > 0 ) {
            Balance += DepositAmount;
            System.out.println("Your balance is now " + Balance);
        }
        else {
            System.out.println("Please enter a valid amount");
        }
    }


    public void withdraw(double WithdrawAmount) {
        if (WithdrawAmount > 0 && WithdrawAmount <= Balance) {
            Balance -= WithdrawAmount;
            System.out.println("Your balance is now " + Balance);
        }
        else {
            System.out.println("Please enter a valid amount");
        }
    }

}

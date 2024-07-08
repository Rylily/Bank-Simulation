import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("WELCOME TO ABC BANK");
        System.out.println("PLEASE ENTER YOUR ACCOUNT NUMBER");
        System.out.println("Account Number : ");
        int AccNum = myScanner.nextInt();
        myScanner.nextLine();
        BankAccount myaccount = new BankAccount(AccNum);
        while (true) {
            System.out.println("Select an Option");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            int number = myScanner.nextInt();
            myScanner.nextLine();
            switch(number) {
                case 1 :
                    myaccount.display();
                    break;
                case 2:
                    System.out.println("How much would you like to deposit? ");
                    double DepositAmt = myScanner.nextDouble();
                    myScanner.nextLine();
                    myaccount.deposit(DepositAmt);
                    break;
                case 3:
                    System.out.println("How much would you like to withdraw? ");
                    double WithdrawAmt = myScanner.nextDouble();
                    myScanner.nextLine();
                    myaccount.withdraw(WithdrawAmt);
                    break;

            }

        }
    }
}
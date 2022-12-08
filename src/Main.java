import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String name;
        String email;
        String phoneNumber;
        String accountType;
        String accountNumber;
        long balance;
        double depositAmount;
        double withdrawalAmount;


        //Creating an obj of the Bank Details class
        BankDetails details1 = new BankDetails();

        //User inputs various details
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter Account type: ");
        accountType = sc.nextLine();


        System.out.print("Enter balance: ");
        balance = sc.nextLong();

        details1.setName(name);
        details1.setAccNo(accountNumber);
        details1.setAcc_type(accountType);
        details1.setBalance(balance);

        //loop runs until number 4 is not pressed to exit
        int ch;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println("1. Display all account details \n 2. Deposit Amount \n 3. Withdraw the amount \n 4.Exit ");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    details1.showAccount();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    depositAmount = sc.nextDouble();
                    details1.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    withdrawalAmount = sc.nextDouble();
                    details1.withdrawal(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("See you soon");
                    break;
            }

        } while (ch != 4);
    }
}
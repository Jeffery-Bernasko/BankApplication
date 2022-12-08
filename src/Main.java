import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("How many number of customers do you want to input: ");

        int n = sc.nextInt();

        //Creating an obj of the Bank Details class
        BankDetails[] details1 = new BankDetails[n];

        for(int i = 0; i<details1.length;i++){
            details1[i] = new BankDetails();
            details1[i].newAccount();
        }
    }
}
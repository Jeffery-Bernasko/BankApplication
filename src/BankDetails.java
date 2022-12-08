public class BankDetails {

    // Attributes of the class
    private String accNo;
    private String Name;
    private String acc_type;
    private long balance;

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }



    //Methods
    //Method to Open new account
    public void newAccount(){
        System.out.println("Enter Account Number: ");
        System.out.println("Enter Account type: ");
        System.out.println("Enter Name: ");
        System.out.println("Enter balance: ");
    }

    //Method to display account details
    public void showAccount(){
        System.out.println("Name of account holder is " + this.Name);
        System.out.println("Account no: " + this.accNo);
        System.out.println("Account Type: " + this.acc_type);
        System.out.println("Balance: " + this.balance);
    }

    //Methods to Deposit and Withdraw from the account
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New Balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount <= 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance is " + this.balance);
        }
    }

    //Method to search for Account Number
    public boolean search(String acc_no){
        if (this.accNo.equals(acc_no)){
            showAccount();
            return true;
        }
        return false;
    }


}

public class BankAccount{
    private String accountNumber;
    private Double balance;
    private String accountHolderName;
    
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.setAccountNumber("1234567890");
        account.setBalance(1000.0);
        account.setAccountHolderName("Mayuri Samanta");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());

        BankAccount account2 = new BankAccount();
        account2.setAccountNumber("0987654321");
        account2.setBalance(-1000.0);
        account2.setAccountHolderName("Vijay Samanta");
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Balance: " + account2.getBalance());
        System.out.println("Account Holder Name: " + account2.getAccountHolderName());
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative");
            return;
        }
        this.balance = balance;
    }


    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}
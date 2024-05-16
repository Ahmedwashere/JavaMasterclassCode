public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        // The this() statement must be the first line called in a constructor
        this(123, 10, "Default Name", "Default Email"
        , "Default Phone Number");
        System.out.println(
                "Empty constructor is used"
        );
    }

    public BankAccount(int accountNumber, int balance, String customerName, String CustomerEmail, String CustomerPhoneNumber){
        System.out.println("BankAccount constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        // if the parameter name is different from the instance variable,
        // we do not need to use the 'this' keyword
        email = CustomerEmail;
        phoneNumber = CustomerPhoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        // Here we set accountNumber and balance to default arguments we select.
        this(9999, 101, customerName, email, phoneNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int amount){
        if (amount <= 0){
            System.out.println(
                    "You must deposit a number greater than zero. " +
                            amount + " is not a valid amount to deposit."
            );
        } else {
            this.balance += amount;
        }
    }

    public void withdrawFunds(int amount){
        if (amount <= 0){
            System.out.println("Please enter a positive withdrawal amount");
        } else if (this.balance - amount < 0){
            System.out.println("Withdrawing this money will cause a negative balance of " + (this.balance - amount));
        } else {
            this.balance -= amount;
        }
    }
}

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    // All argument constructor
    public Customer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // no-argument constructor
    public Customer(){
        // Calls the All argument constructor
        this("Default Name", "defaultEmail@Email.com");
    }

    public Customer(String name, String email){
        this(name, 0.0, email);
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

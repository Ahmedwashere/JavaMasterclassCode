public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer();

        System.out.println("\nName = " + c1.getName() + ".\nCreditLimit = " +
                c1.getCreditLimit() + ".\nEmail = " + c1.getEmailAddress());

        Customer c2 = new Customer("Hamza", "Hamza@gmail.com");

        System.out.println("\nName = " + c2.getName() + ".\nCreditLimit = " +
                c2.getCreditLimit() + ".\nEmail = " + c2.getEmailAddress());

        c2 = new Customer("Abdullah", 1300.59, "dullah@we.com");

        System.out.println("\nName = " + c2.getName() + ".\nCreditLimit = " +
                c2.getCreditLimit() + ".\nEmail = " + c2.getEmailAddress());

    }
}
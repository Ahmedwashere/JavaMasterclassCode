public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(116, 1999, "Yalla Beena",
                "oogabooga@yahoo.com", "(504)-234-0249");


        System.out.println(account.getAccountNumber() + " "
            + account.getBalance() + " " + account.getCustomerName()
            + " " + account.getEmail() + " " + account.getPhoneNumber());
//        account.setAccountNumber(49123);
//        account.setBalance(1000);
//        account.setEmail("oogabooga@yahoo.com");
//        account.setCustomerName("Yalla Beena");
//        account.setPhoneNumber("(504)-234-0249");

        account.depositFunds(130);
        System.out.println("The current balanace is "+ account.getBalance()) ;

        account.depositFunds(-10);
        System.out.println("The current balanace is "+ account.getBalance()) ;

        account.withdrawFunds(130);
        System.out.println("The current balanace is "+ account.getBalance()) ;

        account.withdrawFunds(1000);
        System.out.println("The current balanace is "+ account.getBalance()) ;

        BankAccount accountTwo = new BankAccount("Hallawa", "we@we.com",
                "234-546-5463");

        System.out.println(accountTwo.getAccountNumber() + " "
                + accountTwo.getBalance() + " " + accountTwo.getCustomerName()
                + " " + accountTwo.getEmail() + " " + accountTwo.getPhoneNumber());
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String currentYear = "2024";
        String usersDateOfBirth = "2002";

        try {
            System.out.println(getInputFromConsole(Integer.parseInt(currentYear)));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(Integer.parseInt(currentYear)));
        }

    }

    public static String getInputFromConsole(int currentYear){
            String name = System.console().readLine("Hi, What's your name? ");
            System.out.println("Hey " + name + " wallahi you're finished.");

            String dob = System.console().readLine("What is your birth year? ");
            int age = currentYear - Integer.parseInt(dob);

            return " The age of " + name + " is " + age;
    }

    public static String getInputFromScanner(int currentYear){
        Scanner sc = new Scanner(System.in);
        boolean validAge = true;
        int age = 0;
        System.out.println("What is your name? ");
        String name = sc.nextLine();

        do {
            System.out.println("What year were you born?");
            int yob = sc.nextInt();
            age = currentYear - yob;

            if (age > 100 || age < 0){
                validAge = false;
                System.out.println("Please enter a valid Date Of Birth.");
            } else {
                validAge = true;
            }

            //Scanner.nextLine() can be sent in as an argument to a method in a method call.

        } while (!validAge);

        return "You are " + age + " years old " + name;
    }
}
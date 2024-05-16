import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        minAndMax();
    }

    public static void minAndMax(){
        Scanner sc = new Scanner(System.in);
        boolean maxChanged = false;
        boolean minChanged = false;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        System.out.println("Welcome to the program! Enter any non-numeric character to exit!");

        do {
            // Get the string using scanner
            // Convert it to an integer
            // If any non integer value is sent in, exit the while loop
            System.out.print("Please enter a number: ");
            String numberFromScanner = sc.nextLine();
            try {
                long number = Long.parseLong(numberFromScanner);
                if (number < min){
                    min = number;
                    minChanged = true;
                } else if (number > max){
                    max = number;
                    maxChanged = true;
                }
            } catch (NumberFormatException e){
                System.out.println("Exiting Number Collection!\n");
                break;
            }
        } while(true);

        if (minChanged) {
            System.out.println("The minimum of the numbers entered is " + min);
        } else {
            System.out.println("The minimum hasn't been changed!");
        }

        if (maxChanged) {
            System.out.println("The maximum of the numbers entered is " + max);
        }  else {
            System.out.println("The maximum hasn't been changed");
        }
    }
}
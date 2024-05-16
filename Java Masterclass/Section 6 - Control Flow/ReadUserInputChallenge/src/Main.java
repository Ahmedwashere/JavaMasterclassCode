import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sumValuesFromUser();
    }

    public static void sumValuesFromUser(){
        // number sum to keep hold of the data from user
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int validNumberCount = 0;

        // do while that keeps count of data from user
        do {
            System.out.print("Enter number #"
                    + (validNumberCount + 1) + ": ");
            String numberFromUser = sc.nextLine(); // The console uses readLine but the scanner uses nextLine.
            try {
                double parsedInt = Double.parseDouble(numberFromUser);
                sum += parsedInt;
                validNumberCount++;
            } catch (NumberFormatException e){
                System.out.println("Please Enter A Valid Number! You did not enter a number.");
            }

        } while (validNumberCount < 5);

        // counter that increments when user passes in a valid integer

        //ReadLine instance method for input

        //Integer.parseInt

        // try catch block for integer.parseInt

        System.out.println("The sum of your 5 numbers are " + sum);
    }
}
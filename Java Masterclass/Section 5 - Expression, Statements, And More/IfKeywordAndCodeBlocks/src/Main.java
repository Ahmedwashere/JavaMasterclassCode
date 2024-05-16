public class Main {

    public static void main(String[] args) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        printSquareStar(10);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    // Condition to determine if a star should be printed
                    if (i == 0 || i == number - 1) { // Top and bottom rows
                        System.out.print("*");
                    } else if (j == 0 || j == number - 1) { // First and last columns
                        System.out.print("*");
                    } else if (i == j) { // Main diagonal from top left to bottom right
                        System.out.print("*");
                    } else if (j == number - i - 1) { // Secondary diagonal from top right to bottom left
                        System.out.print("*");
                    } else { // Filling spaces where no star should be printed
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

}

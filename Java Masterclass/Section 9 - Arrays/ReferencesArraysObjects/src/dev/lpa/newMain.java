package dev.lpa;

public class newMain {
    public static void main(String... args) {
        System.out.println("32, 54, 51 = ");
        printIntegers(32, 54, 51);
        printIntegers(213);
        printIntegers();

    }

    private static void printIntegers(int... numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        System.out.println(sum);
    }
}

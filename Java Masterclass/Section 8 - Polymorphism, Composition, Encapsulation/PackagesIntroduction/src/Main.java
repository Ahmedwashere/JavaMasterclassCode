import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] integerArray = new int[10];
        integerArray[5] = 40;

        double[] doubleArr = new double[10];
        doubleArr[2] = 1.234;

        System.out.println(integerArray.getClass().getSimpleName());

        for(int i = 0; i < integerArray.length; i++){
            integerArray[i] = i + 1;
        }

        for(int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i] + " ");
        }

        System.out.println();
        //This makes a String by calling the static method toString from
        // Arrays class
        String arrayElementsInString = Arrays.toString(integerArray);

        System.out.println(arrayElementsInString);

        

    }
}
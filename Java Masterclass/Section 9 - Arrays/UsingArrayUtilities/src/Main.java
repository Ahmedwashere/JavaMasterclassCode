import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(40);
        System.out.println(Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));

        //create an array with base values WE PICK for all elements
        int[] secondArr = new int[10];
        System.out.println(Arrays.toString(secondArr));
        Arrays.fill(secondArr, 20);
        System.out.println(Arrays.toString(secondArr));

        int[] thirdArray = generateRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        //Create a totally new String Object as well.
        // Partial Copy
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length - 5);
        System.out.println(Arrays.toString(fourthArray));

        // Full copy plus more elements.
        int[] fifthArray = Arrays.copyOf(thirdArray, thirdArray.length + 5);
        System.out.println(Arrays.toString(fifthArray));

        int indexOfFive = Arrays.binarySearch(randomArray, 35);
        System.out.println(randomArray[indexOfFive] + " " +
                "index is " + indexOfFive);


        //Another important method for comparing arrays
        //Arrays.equals(Array1, Array2);

    }

    public static int[] generateRandomArray(int len){
        Random random = new Random(0);
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }

        return arr;
    }
}
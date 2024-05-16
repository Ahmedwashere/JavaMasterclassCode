import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    // write code here

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        int[] sortedNumbers = sortIntegers(numbers);
        System.out.println(Arrays.toString(sortedNumbers));

//        int[] integ = getIntegers(10);
//        System.out.println(Arrays.toString(integ));
    }


    public static int[] getIntegers(int size){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            String input = sc.nextLine();
            array[i] = Integer.parseInt(input);
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){
        int[] array = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++){
                if((array[j] < array[j+1])){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }
}

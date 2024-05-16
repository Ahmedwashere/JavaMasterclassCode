import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] randomArray = generateRandomNumberArray(10);
        System.out.println(Arrays.toString(randomArray));


        int[] sortedArray = sortReverse(randomArray);
        System.out.println(Arrays.toString(sortedArray));

        int[] streamSorted = sortReverseStreams(randomArray);
        System.out.println(Arrays.toString(streamSorted));



    }

    private static int[] generateRandomNumberArray(int length){
        Random random = new Random(0);
        int[] arr = new int[length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }

        return arr;
    }

    public static int[] sortReverse(int [] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * -1;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * -1;
        }
        return arr;
    }

    public static int[] sortReverseStreams(int[] arr){
        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArray, Collections.reverseOrder());
        int[] output = Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();
        return output;
    }
}
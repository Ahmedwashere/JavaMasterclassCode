package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter Numbers seperated by ','. Q to Quit.");
//        System.out.print("Numbers = ");
//        System.out.println();
//        String numbers = sc.nextLine();
//        int[] arrayInt = readIntegers(numbers);
//        System.out.println(Arrays.toString(arrayInt));
//        System.out.println("Min: " + findMin(arrayInt));
//        System.out.println(Arrays.toString(reverseArray(arrayInt)));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.deepToString(anyArray));
        //Must include new keyword and type if nesting an array in another array.
        anyArray[0] = new String[]{"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));
        anyArray[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[3][3][4];
        System.out.println(Arrays.deepToString(anyArray));
    }

    public static int[] readIntegers(String stringNums){
        String[] strings = stringNums.split(",");
        int[] nums = new int[strings.length];
        int cut = -1;
        for (int i = 0; i < strings.length; i++){
            try{
                //trim takes off the spaces before or after the comma.
                nums[i] = Integer.parseInt(strings[i].trim());
                cut = i;
            } catch (NumberFormatException e){
                System.out.println("Non numeric input has been passed: " +
                        "returning array so far.");
                return Arrays.copyOf(nums, i);
            }
        }
        return nums;
    }

    public static int findMin(int[] numbers){
        int min = Integer.MAX_VALUE;
        for(int num : numbers){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    public static int[] reverseArray(int[] numbers){
        int i = 0;
        int j = numbers.length-1;

        while (i < j){
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            i++;
            j--;
        }
        return numbers;
    }
}
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Method to print a list traditionally v.s. functionally
        printAllNumberInListStructured(List.of(4,3,2,1,11,32));
        System.out.println();
        printEvenNumberInListStructured(List.of(4,3,2,1,11,32));
        System.out.println();
        printAllNumberInListFunctional(List.of(4,3,2,1,11,32));
        System.out.println();
        printEvenNumberInListFunctional(List.of(4,3,2,1,11,32));
    }

    private static boolean isEven(int i){
        return i % 2 == 0;
    }

    private static void printEvenNumberInListFunctional(List<Integer> integers) {
        integers.stream()
                .filter(integer -> {
                    if (integer % 2 == 0){
                        return true;
                    }
                    return false;
                })
                //.filter(Main::isEven)
                //.filter(integer -> integer % 2 == 0)  -> lambda expression
                .forEach(Main::print);

        // A Lambda Expression is nothing but a method, but the method has
        // simpler syntax.

        // Lambda Expression
            // Left of -> is the value the function takes (integer)
            // Right of the -> is the operation you would like to perform
    }

    private static void print(int number){
        System.out.print(number + " ");
    }


    // Functional Approach
    private static void printAllNumberInListFunctional(List<Integer> integers) {
        //Gotta convert a list into a stream
        //forEach performs an action on each element
        //The action you perform on each element is defined outside the method
        // Then use a method reference 'ClassName::MethodSignature' to apply that
        // to each integer
        integers.stream()
                .forEach(System.out::print);
                //.forEach(Main::print);
    }


    // Traditional Approach
    private static void printAllNumberInListStructured(List<Integer> list) {
        for(Integer i : list){
            System.out.print(i + " ");
        }
    }

    private static void printEvenNumberInListStructured(List<Integer> list) {
        for(Integer i : list){
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
import java.util.List;

public class IntroExercises {
    public static void main(String[] args) {
        var numbers = List.of(3, 8, 15, 22, 9, 4, 17, 6, 11, 2);
        var courses = List.of("Introduction to Programming",
                "Data Structures", "Spring Boot Fundamentals",
                "Database Management", "Web Development with Spring",
                "Machine Learning", "Operating Systems",
                "Computer Networks", "Software Engineering", "Algorithms");
        printOddNumbersTraditional(numbers);
        printOddNumbersFunctional(numbers);

        printCoursesFunctional(courses);
        System.out.println();
        printSpringCoursesFunctional(courses);
        System.out.println();
        printLengthTwentyCoursesFunctional(courses);
        System.out.println();
        printLengthOfAllCourses(courses);
    }

    private static void printLengthOfAllCourses(List<String> courses) {
        courses.stream()
                .map(x -> x + ": " + x.length())
                .forEach(System.out::println);
    }


    public static void printSpringCoursesFunctional(List<? extends String> courses){
        courses.stream()
                .filter(string -> string.toUpperCase().contains("SPRING"))
                .forEach(System.out::println);
    }

    public static void printLengthTwentyCoursesFunctional(List<? extends String> courses){
        courses.stream()
                .filter(string -> string.length() >= 20)
                .forEach(System.out::println);
    }

    private static void printCoursesFunctional(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }


    public static void printOddNumbersFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(integer -> integer%2 == 1)
                .forEach(System.out::println);
    }



    public static void printOddNumbersTraditional(List<Integer> numbers){

        for (var number : numbers){
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}

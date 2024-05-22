import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Integer five = 5;
        int[] others = {0, 5, 10, -40, 490};

        for (int i : others){
            // CompareTo can only be called on Classes that
            // Inherit from Object. Object likely implments Comparable.
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"),
                    i, val);
        }

        String banana = "banana";
        String[] fruits = {"apple", "banana", "Banana", "pear", "BANANA"};

        // This for loop return the difference in characters that determine the sort.
        // For example p has a value of 112 and b has a value of 98 so p > b;
        // If we do compareTo banana and pear, we get -14 as 98 - 112 = -14!
        for (String fruit: fruits){
            int val = banana.compareTo(fruit);
            System.out.printf("%s %s %s: compareTo=%d%n", banana,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"),
                    fruit, val);
        }

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        // If we try to sort Objects, we get a class cast exception
        // Hence we need to implement comparable in the class
        Student tim = new Student("Tim");
        Student[] students = new Student[] {new Student("Zach"),
                new Student("Tim"), new Student("Ann")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        // Now we can only compare Students. We can't pass a String to
        // compare to.

        // If we want it sorted in reversed, then we can use a default method
        // gpaSorter.reversed() - sorts in descending order here.
        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
    }
}

class StudentGPAComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        // This compares two Strings
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
}

// Now we will add a type to comparable
class Student implements Comparable<Student>{
    private static int LAST_ID = 1000;
    private static Random random = new Random();
    String name;
    private int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

//    @Override
//    public int compareTo(Object o) {
//        //Since we can compare characters, we can compare the names
//        //However, we must cast the Object before comparison as Object
//        //Does not have the attributes we have defined in student
//        // AKA. Always cast to the Class type you are comparing to for safety.
//        Student other = (Student) o;
//        return this.name.compareTo(other.name);
//    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }

    // If we do not implement this,
    // we get a class cast exception when sorting


}

// Comparator interface.
// has a compare method that takes two of same type
// instead of one

// Usually include Comparator as a nested class
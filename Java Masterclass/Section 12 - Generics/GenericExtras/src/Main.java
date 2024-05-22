import com.google.LPAStudent;
import com.google.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            Student s = new Student();
            if (!students.contains(s)){
                students.add(s);
            }
        }

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            LPAStudent s = new LPAStudent();
            if (!lpaStudents.contains(s)){
                lpaStudents.add(s);
            }
        }


        printMoreLists(students);
        printMoreLists(lpaStudents);

        List<String> names = new ArrayList<>(List.of("Ann", "Bill", "Cathy", "John", "Tim", "Ahmed"));
        List<Integer> integers = new ArrayList<>(List.of(1,2,3));
        testList(names);
        testList(integers);

        /*
        When used as reference types, a container of one type has no
        relationship to the same container of another type, even if the
        contained types do have a relationship.

        Can pass List<LPAStudent> to a method that takes List<Student> as an
        argument because of this phenomenon even though LPAStudent inherits
        and it a subclass of Student
         */
//        printList(students);


    }

    // Method that causes error
//    public static void printList(List<Student> students){
//
//        for (var student : students){
//            System.out.println(student);
//        }
//        System.out.println();
//    }

    // Using the raw type of list is possible but definetely not recommended
    // Why? It provides no type safety at all. We can't ensure they are
    // truly students could be integers even.
//    public static void printList(List students){
//
//        for (var student : students){
//            System.out.println(student);
//        }
//        System.out.println();
//    }

    // Wild Card Type can only be used in a type argument, not in type
    // parameter declaration. I cannot use wild types when declaring E.X.
    // This is NOT ALLOWED! We cannot using wild card in instantiation.
    // List<> students = new ArrayList<? extends Student>();
    public static void printMoreLists(List<? extends Student> students){

//        // The compiler cannot infer whether the List is of Student or its subtypes
//        // And therefore will not allow you to add it to the list.
//        Student last = students.get(students.size()-1);
//        students.set(0, last);

        for (var student : students){
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    // Type Erasure - It erases the T S U V and replaces it with the type
    // passed in during runtime in the class file and byte code.


    // Works for both integers and strings
    public static void testList(List<?> list){
        for (var element : list){
            if (element instanceof String s){
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i){
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

//    public static void testList(List<? extends String> list){
//        for (var element : list){
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<? extends Number> list){
//        for (var element : list){
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }

//    public static <T extends Student> void printList(List<T> students){
//
//        for (var student : students){
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }
}

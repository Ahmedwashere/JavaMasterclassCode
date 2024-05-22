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

        printList(students);
        printList(lpaStudents);

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

    public static void printList(List students){

        for (var student : students){
            System.out.println(student);
        }
        System.out.println();
    }
}

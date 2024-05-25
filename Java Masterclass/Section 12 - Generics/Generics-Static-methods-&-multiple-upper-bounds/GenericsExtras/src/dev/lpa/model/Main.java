package dev.lpa.model;

import dev.lpa.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Comparators
        CourseSorter courseSorter = new CourseSorter();
        PercentCompleteSorter percentCompleteSorter = new PercentCompleteSorter();

        // Make QueryList to hold students
        QueryList<LPAStudent> students = new QueryList<>();

        int studentsToMake = 25;
        for(int i = 0; i < studentsToMake; i++){
            students.add(new LPAStudent());
        }
        students.set(0, students.get(students.size()-1));

        printList(students);

        System.out.println("-".repeat(50));

        // Relies on the compareTo method from Comparable class to sort
        students.sort(Comparator.naturalOrder());

        printList(students);

        System.out.println("-".repeat(50));

        students.sort(courseSorter);

        printList(students);

        System.out.println("-".repeat(50));

        students.sort(percentCompleteSorter);

        printList(students);

        System.out.println("-".repeat(50));

        var matches = students.getMatches("percent complete", "30.1");

        printList(matches);

//        var arrayOfStudents = students.toArray();
//        Arrays.sort(arrayOfStudents);
//        for (var student : arrayOfStudents){
//            System.out.println(student);
//        }


    }

    public static  void printList(List<? extends Student> students){
        for (var student : students){
            System.out.println(student);
        }
    }
}

class CourseSorter implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse().compareTo(o2.getCourse());
    }
}

class PercentCompleteSorter implements Comparator<LPAStudent>{

    @Override
    public int compare(LPAStudent o1, LPAStudent o2) {
        return Double.valueOf(o1.getPercentComplete()).compareTo(
                Double.valueOf(o2.getPercentComplete()));
    }
}

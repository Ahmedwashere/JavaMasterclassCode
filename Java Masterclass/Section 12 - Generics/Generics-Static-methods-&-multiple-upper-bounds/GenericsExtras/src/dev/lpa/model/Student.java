package dev.lpa.model;

import dev.lpa.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {

    private static int LAST_ID = 1000;
    private int id;
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);
        id = LAST_ID;
        LAST_ID++;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d %d".formatted(name, course, yearStarted, id);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {

        String fName = fieldName.toUpperCase();
        return switch(fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }

    // Use the Wrapper class as compareto takes an Object
    // Object has no value called id
    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}

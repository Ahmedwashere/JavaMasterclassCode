package com.google;

import java.util.Random;

public class Student {
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    // These static variables will make it easy to create many different students
    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim", "Ahmed"};
    private static String[] courses = {"Java Masterclass", "Machine Learning", "Algorithms", "Linear Algebra"};

    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(firstNames.length)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(courses.length)];
        yearStarted = random.nextInt(2018, 2023);
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }
}

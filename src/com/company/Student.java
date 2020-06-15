package com.company;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String schoolName;
    private final int startingYear;
    private final int graduationYear;

    public Student(StudentBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.schoolName = builder.schoolName;
        this.startingYear = builder.startingYear;
        this.graduationYear = builder.graduationYear;

    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", startingYear=" + startingYear +
                ", graduationYear=" + graduationYear +
                '}';
    }
}

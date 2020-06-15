package com.company;

public class StudentBuilder {
    public  String firstName;
    public   String lastName;
    public  String schoolName;
    public   int startingYear;
    public   int graduationYear;


    public StudentBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public StudentBuilder schoolName(String schoolName){
        this.schoolName = schoolName;
        return this;
    }

    public StudentBuilder startingYear(int startingYear) {
        this.startingYear = startingYear;
        return this;
    }

    public StudentBuilder graduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
        return this;
    }

    public Student build(){
        Student student = new Student(this);
        return student;
    }

}

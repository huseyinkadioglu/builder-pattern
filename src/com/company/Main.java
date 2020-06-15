package com.company;

public class Main {

    public static void main(String[] args) {

       Student huseyin = new StudentBuilder("Huseyin","Kadıoğlu")
               .schoolName("KTU")
               .startingYear(2015)
               .graduationYear(2020)
               .build();

        System.out.println(huseyin);

        Student melisa = new StudentBuilder("Melisa","Turgut")
                .schoolName("MU")
                .startingYear(2017)
                .graduationYear(2022)
                .build();

        System.out.println(melisa);

    }
}

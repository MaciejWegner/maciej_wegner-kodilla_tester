package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Maciej", new Teacher("Marcin")));
        studentList.add(new Student("Maja",null));
        studentList.add(new Student("MartynaKaja", new Teacher("Mieczysław")));
        studentList.add(new Student("Mariusz", new Teacher("Matylda")));
        studentList.add(new Student("Milena", null));


        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
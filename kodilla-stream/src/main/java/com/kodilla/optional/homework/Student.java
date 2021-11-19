package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    private String validatingIfNull() {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher); //brak wartości
        return optionalTeacher.orElse(new Teacher("<undefined>")).getName();
    }

    @Override
    public String toString() {
        String teacher = validatingIfNull();

        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }

}
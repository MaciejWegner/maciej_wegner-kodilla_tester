package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double result = UsersRepository.getUsersList()

                .stream()
                .map(u ->u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()//
                .getAsDouble();
        System.out.println("Srednia postów wszystkich osób: " + result);

        double resultForYounger = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(value -> value.getNumberOfPosts())
                .average()
                .getAsDouble();
        System.out.println("Srednia postów dla osób przed 40.: " + resultForYounger);

        double resultForAdults = UsersRepository.getUsersList()
                .stream()
                .filter(value -> value.getAge() >= 40)
                .mapToInt(value -> value.getNumberOfPosts())
                .average()
                .getAsDouble();
        System.out.println("Srednia postów dla osób po 40.: " + resultForAdults);

    }
}
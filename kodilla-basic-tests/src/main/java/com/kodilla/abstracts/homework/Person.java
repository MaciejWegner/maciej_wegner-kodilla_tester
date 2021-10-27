package com.kodilla.abstracts.homework;

public class Person {
    private final Job job;
    private String firstName;
    private int age;


    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;

    }

    public void showResponsibilities() {
        System.out.println(job.getResponsibilities());
    }

    public static void main(String[] args) {

        Job truckDriver = new TruckDriver();
        Job teacher = new Teacher();
        Job doctor = new Doctor();
        Person person1 = new Person("Adam", 34, truckDriver);
        person1.showResponsibilities();

    }
}

//w treści zadania jest mowa o tym że metoda ma zwracac obowiąki danej osoby - tylko//
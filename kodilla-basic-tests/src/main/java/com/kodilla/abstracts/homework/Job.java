package com.kodilla.abstracts.homework;

public class Job {
    private int Salary;
    private String Responsibilities;

    public Job(int Salary, String Responsibilities) {

        this.Salary = Salary;
        this.Responsibilities = Responsibilities;
    }

    public int getSalary() {
        return Salary;
    }
    public String getResponsibilities() {
        return Responsibilities;
    }
}
//Utwórz klasę abstrakcyjną Job (zawód), z polami salary oraz responsibilities V. Utwórz kilka konkretnych zawodów (klas dziedziczących po Job). W kolejnym kroku utwórz klasę Person, która zawierać będzie pola firstName, age i job. Dodaj metodę, która wyświetli obowiązki danej osoby w pracy.
//        Gotowy kod prześlij do repozytorium, wklej link poniżej i wyślij do Mentora.
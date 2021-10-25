package com.kodilla.abstracts.homework;

public class Person {
    private int FirstName;
    private int Age;

    public Person(int FirstName, int Age) {
        this.FirstName = FirstName;
        this.Age = Age;

        public int getFirstName () {
            return FirstName;

            //private Job() {
            // super();
            //}

        }
        public int getAge () {
            return Age;
        }
    }

    public static void main(String[] args) {

        Job truckDriver = new TruckDriver();
        Job teacher = new Teacher();
        Job doctor = new Doctor()
        System.out.println("TruckDriver" + truckDriver.getResponsibilities() + " "
                + "Teacher" + " " + teacher.getResponsibilities() +
                "Doctor" + " " + doctor.getResponsibilities());
    }
}
//w treści zadania jest mowa o tym że metoda ma zwracac obowiąki danej osoby - tylko//
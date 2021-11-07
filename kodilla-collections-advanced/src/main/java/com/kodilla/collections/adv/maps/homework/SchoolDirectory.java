package com.kodilla.collections.adv.maps.homework;

        import com.kodilla.collections.adv.maps.complex.Student;

        import java.util.HashMap;
        import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> principalSchoolMap = new HashMap<>();
        Principal principal1 = new Principal("Jan", "Kowalski");
        Principal principal2 = new Principal("Jan", "Nowak");
        Principal principal3 = new Principal("Jan", "Wegner");

        School school1 = new School("Adama Mickiewicza");
        school1.addStudent(new Student("Gal", "Anonim"));
        school1.addStudent(new Student("Gal", "Anonim"));
        school1.addStudent(new Student("Gal", "Anonim"));
        school1.addStudent(new Student("Gal", "Anonim"));

        School school2 = new School("Jana Kochanowskiego");
        school2.addStudent(new Student("Gal", "Anonim"));
        school2.addStudent(new Student("Gal", "Anonim"));
        school2.addStudent(new Student("Gal", "Anonim"));
        school2.addStudent(new Student("Gal", "Anonim"));
        school2.addStudent(new Student("Gal", "Anonim"));

        School school3 = new School("Billa Gatesa");
        school3.addStudent(new Student("Gal", "Anonim"));
        school3.addStudent(new Student("Gal", "Anonim"));
        school3.addStudent(new Student("Gal", "Anonim"));

        principalSchoolMap.put(principal1, school1);//przyporządkowanie szkoły do dyrektora
        principalSchoolMap.put(principal2, school2);
        principalSchoolMap.put(principal3, school3);

        int totalStudentsNumber = 0;
        for (Map.Entry<Principal, School> principalSchoolEntry : principalSchoolMap.entrySet()) {
            System.out.println(principalSchoolEntry.getKey() + " jest dyrektorem "
                    + principalSchoolEntry.getValue() +  " , do której chodzi uczniów: " + principalSchoolEntry.getValue().giveSize() );
            totalStudentsNumber += principalSchoolEntry.getValue().giveSize();
        }
        System.out.println("Całkowita liczba studentów: "+ totalStudentsNumber);

    }

}
//    Klasę SchoolDirectory z metodą main.
//        Klasę Principal, która będzie reprezentowała dyrektora szkoły.
//        Klasę School, która będzie reprezentowała szkołę, a w niej pole (typu ArrayList),
//        które będzie przechowywało listę liczb uczniów w poszczególnych klasach.
//        Wewnątrz metody main stwórz mapę przyporządkowującą szkoły do dyrektorów.
//        Dodaj do mapy kilka wpisów – przykładowych dyrektorów i szkół.
//        Wykorzystując pętlę for-each, wyświetl informacje o dyrektorach placówek,
//        nazwie szkoły, którą kierują, oraz o łącznej liczbie uczniów w każdej szkole.
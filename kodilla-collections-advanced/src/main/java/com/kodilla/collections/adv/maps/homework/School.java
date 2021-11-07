package com.kodilla.collections.adv.maps.homework;

        import com.kodilla.collections.adv.maps.complex.Student;

        import java.util.ArrayList;
        import java.util.List;

public class School {
    private String schoolName;
    private List<Student> students = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "szkoły imienia: " + schoolName;
    }

    public int giveSize() {
        return students.size();
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
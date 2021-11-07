package com.kodilla.collections.adv.maps.homework;

        import java.util.Objects;

public class Principal {
    private String name;
    private String lastname;

    public Principal(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Dyrektor " + name + " " + lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(name, principal.name) &&
                Objects.equals(lastname, principal.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }

}

//    Klasę SchoolDirectory z metodą main.
//        Klasę Principal, która będzie reprezentowała dyrektora szkoły. V
//        Klasę School, która będzie reprezentowała szkołę, a w niej pole (typu ArrayList),
//        które będzie przechowywało listę liczb uczniów w poszczególnych klasach.
//        Wewnątrz metody main stwórz mapę przyporządkowującą szkoły do dyrektorów.
//        Dodaj do mapy kilka wpisów – przykładowych dyrektorów i szkół.
//        Wykorzystując pętlę for-each, wyświetl informacje o dyrektorach placówek,
//        nazwie szkoły, którą kierują, oraz o łącznej liczbie uczniów w każdej szkole.
public class Grades {

    private int[] grades;
    private int size;
    private int averageGrade;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.averageGrade = 0;
    }

    public void add(int value) { // dodającą przekazaną w argumencie ocenę do tablicy
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }


    public void srednia(int[] grades) {

        int suma = 0;
        int iloscOcen = grades.length;

        for (int i = 0; i < grades.length; i++) {
            suma += grades[i];}

        // dzielimy zsumowaną tablicę przez ilość ocen w tablicy
        int averageGrade = suma / iloscOcen;

        System.out.println(averageGrade);}

    public void ostaniaWartosc(int[] grades) {
        int iloscOcen = grades.length;
                grades = new int [iloscOcen];
        for(int i=0; i<grades.length; i++)
            grades[i] = i+1;
        int licznik=0;
        while(licznik<grades.length){
            System.out.print(grades[licznik]+" ");
        licznik++;}
        }
    }
    //nie wiem jak zrobić "zwracanie ostatnio dodanej oceny" - chciałbym to przedyskutować

public class LeapYear {
    private static boolean RokPrzestepny (int rok)
    {return ((rok % 4 == 0) && (rok % 100 != 0 )) || (rok % 400 == 0);
    }
    public static void  main(String[] args) {
        int rok = 2001;
        if (RokPrzestepny(rok)){
        System.out.println("Podany rok jest przestepny.");
    }
    else {
        System.out.println("Podany rok jest nie przestepny.");
    }
    }
}

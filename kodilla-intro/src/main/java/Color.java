
import java.util.Scanner;

public class Color {
    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select first leter of the color (Y-yellow, R-red, B-black, O-orange):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "Y":
                    return "Yellow";
                case "R":
                    return "Red";
                case "B":
                    return "Black";
                case "O":
                    return "Orange";
                default:
                    System.out.println("Try again.Use capital LETTER");
            }
        }
    }
}

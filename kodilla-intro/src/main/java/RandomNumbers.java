import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        int min = 30;
        int max = 0;
        int sum = 0;
        while (sum < 5000) {
            int n1 = r.nextInt(31);
            sum = sum + n1;
            System.out.println(n1 + "=" + sum);

            if (n1 > max) {
                max = n1;
            }
            if (n1 <= min) {
                min = n1;
            }
        }
        System.out.printf("wartość max wynosi" + " " + max);
        System.out.printf("wartość min wynosi" + " " + min);
    }
}
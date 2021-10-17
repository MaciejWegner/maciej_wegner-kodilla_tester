import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args){
Random r = new Random();
        int result=0;
int min=0;
int max = 30;
int sum=0;
       while(sum<5000){
           int n1= r.nextInt(31);
           sum=sum+n1;
           System.out.println(n1+"="+sum);
    result++;
           if(n1>=max) {
               max=n1;
               System.out.printf("wartość max wynosi" + " " + max);
    }
        if(n1<=min) {
            System.out.printf("wartość min wynosi" + " " + min);
        }
    }
    }
}
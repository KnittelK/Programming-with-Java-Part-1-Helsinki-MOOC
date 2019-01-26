
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int exp = 0;
        System.out.println("Type a number: ");
        int upper_exp = reader.nextInt();
        int sum = 0;
        int val = 0;
        
        while (exp <= upper_exp) {
            val += Math.pow(2, exp);
            exp++;
        }
        System.out.println("The result is " + val);

    }
}

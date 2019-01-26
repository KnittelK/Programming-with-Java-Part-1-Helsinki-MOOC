import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = reader.nextInt();
        int i = 1;
        int factorial = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial is " + factorial);

    }
}

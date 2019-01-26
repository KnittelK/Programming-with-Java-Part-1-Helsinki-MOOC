
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int num = Integer.parseInt(reader.nextLine());
        if (num <= 29) {
            System.out.println("Grade: fail" );
        } else if (num <= 34) {
            System.out.println("Grade: 1" );
        } else if (num <= 39) {
            System.out.println("Grade: 2" );
        } else if (num <= 44) {
            System.out.println("Grade: 3");
        } else if (num <= 49) {
            System.out.println("Grade: 4");
        } else if (num <= 60) {
            System.out.println("Grade: 5");
        }

    }
}

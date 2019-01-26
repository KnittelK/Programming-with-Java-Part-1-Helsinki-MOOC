
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.println("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double cir = radius * Math.PI * 2;
        System.out.println("Circumference of the circle: " + cir);
    }
}

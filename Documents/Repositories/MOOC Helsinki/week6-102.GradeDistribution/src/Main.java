import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes:");
        ArrayList<Integer> rawGrades = new ArrayList<Integer>();
        
        while (true) {
            int digit = scanner.nextInt();
            if (digit != -1) {
                if (digit <= 60 && digit >= 0) {
                    rawGrades.add(digit);
                }
            } else {
                break;
            }
        }
        Grades grades = new Grades(rawGrades);
        System.out.println("Grade distribution:");
        grades.printLine();
        System.out.print("Acceptance percentage: ");
        System.out.print(((grades.getPassed())/(double)rawGrades.size()) * 100);
    }
}

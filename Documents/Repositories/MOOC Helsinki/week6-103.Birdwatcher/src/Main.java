import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    Scanner scanner = new Scanner(System.in);
    birdDatabase birdData = new birdDatabase();
    
    while (true) {
        System.out.println("?");
        String input = scanner.nextLine();
        if (input.equals("Quit")) {
            break;
        } else if (input.equals("Add")) {
            System.out.println("Name: ");
            String birdName = scanner.nextLine();
            System.out.println("Latin Name: ");
            String birdLatinName = scanner.nextLine();
            
            // Create a bird and add it to database:
            Bird bird = new Bird(birdName, birdLatinName);
            birdData.addBird(bird);
        } else if (input.equals("Observation")) {
            System.out.println("What was observed:? ");
            String name = scanner.nextLine();
            birdData.Observation(name);
        } else if (input.equals("Statistics")) {
            birdData.Statistics();
        } else if (input.equals("Show")) {
            System.out.println("What? ");
            String name = scanner.nextLine();
            birdData.Show(name);
        }
    }
    }

}

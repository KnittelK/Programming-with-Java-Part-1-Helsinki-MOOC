import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        while (true) {
            System.out.println("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()){
                break;
            } else {
                System.out.println("studentnumber: ");
                String studentID = reader.nextLine();

                Student student = new Student(name, studentID);
                list.add(student);
            }
            
        }
        for (Student ele : list) {
            System.out.println(ele.toString());
        }
        
        System.out.println("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result: ");
        for (Student ele : list) {
            if (ele.getName().contains(term)) {
                System.out.println(ele.toString());
            }
        }
    }
}

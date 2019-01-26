
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int ele : list) {
            total += ele;
        }
        return total;
    }
    

    public static double average(ArrayList<Integer> list) {
        return sum(list) / (double)list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}

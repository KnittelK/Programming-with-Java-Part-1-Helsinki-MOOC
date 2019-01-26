import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int ele : list) {
            total += ele;
        }
        return total;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return sum(list) / (double)list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double avg = average(list);
        double total = 0;
        for (int ele : list) {
            total += Math.pow(ele-avg, 2);
        }
        return total/((double)list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}

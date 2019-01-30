import java.util.ArrayList;

public class NumberStatistics {
    private int amountOfNumbers;
    private ArrayList<Integer> integers = new ArrayList<Integer>();
    
    public NumberStatistics() {
    }
    
    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.integers.add(number);
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        int total = 0;
        for (int ele : this.integers) {
            total+=ele;
        }
        return total;
    }
    
    public double average() {
        if (!(this.integers.isEmpty())) {
            return (sum())/(double) integers.size();
        } else {
            return (double)0;
        }
    }
}

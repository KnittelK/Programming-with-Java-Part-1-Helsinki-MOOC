import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
  
    }
    public static int smallest(int[] array) {
        int smallest = 99999;
        for (int i = 0; i<array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int small = smallest(array);
        int index = 0;
        while (true) {
            if (array[index] == small) {
                break;
            } else {
                index++;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = 9999999;
        int smallestIndex = 0;
        while (index < array.length) {
            if (array[index] < smallest) {
                smallest = array[index];
                smallestIndex = index;
            }
            index++;
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int first = array[index1];
        int second = array[index2];
        
        array[index1] = second;
        array[index2] = first;
    }
    
    public static void sort(int[] array) {
        for (int i=0; i<array.length; i++) {
            swap(array, indexOfTheSmallestStartingFrom(array, i), i);
            System.out.println(show(array));
        }
    }
    public static String show(int[] array) {
        String toPrint = "[";
        for (int i=0; i<array.length; i++) {
            if (i != array.length-1){
                toPrint += array[i] + ", ";
            } else {
                toPrint += array[i] + "]";
            }
        }
        return toPrint;
    }
    
    
}

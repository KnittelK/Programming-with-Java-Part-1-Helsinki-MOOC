/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KevinK
 */
import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> rawGrades;
    private int[] scaledGrades;
    private int passed;
    
    public Grades(ArrayList<Integer> grades) {
        this.rawGrades = grades;
        this.scaledGrades = convert();
    }
    
    private int[] convert() {
        scaledGrades = new int[this.rawGrades.size()];
        for (int i=0; i<this.rawGrades.size(); i++) {
            this.scaledGrades[i] = rawToGrade(this.rawGrades.get(i));
        }
        return scaledGrades;
    }
    
    private int rawToGrade(int grade) {
        int Grade = -1;
        
        if (grade <= 29) {
            Grade = 0;
        } else if (grade <= 34) {
            Grade = 1;
            passed++;
        } else if (grade <= 39) {
            Grade = 2;
            passed++;
        } else if (grade <= 44) {
            Grade = 3;
            passed++;
        } else if (grade <= 49) {
            Grade = 4;
            passed++;
        } else if (grade <= 60) {
            Grade = 5;
            passed++;
        }
        return Grade;
    }
    
    private int instances(int search) {
        int count=0;
        for (int ele : this.scaledGrades) {
            if (ele == search) {
                count++;
            }
        }
        return count;
    }
    
    public void printLine() {
        for (int i=5; i>-1; i--) {
            System.out.print(i + ": ");
            printStars(instances(i));
            System.out.println("");
        }
        
    }
    
    private void printStars(int num) {
        while (num != 0) {
            System.out.print("*");
            num--;
        }
    }

    public int getPassed() {
        return this.passed;
    }
}

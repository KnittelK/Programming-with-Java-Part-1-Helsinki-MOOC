/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KevinK
 */
import java.util.Random;


public class NightSky {
    private double density;
    private int width;
    private int height;
    private int count;
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.count = 0;
    }
    
    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.count = 0;
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.height = height;
        this.width = width;
        this.count = 0;
    }
    
    public void printLine() {
        String stars = "";
        Random random = new Random();
        for (int i = 0; i<this.width; i++) {
            if (random.nextDouble() <= this.density) {
                stars += "*";
                this.count++;
            } else {
                stars += " ";
            }
        }
        System.out.println(stars);
    }
    
    public void print() {
        for (int i=0; i<this.height; i++) {
            printLine();
        }
    }
    
    public int starsInLastPrint() {
        int clone = count;
        this.count = 0;
        return clone;
    }
}

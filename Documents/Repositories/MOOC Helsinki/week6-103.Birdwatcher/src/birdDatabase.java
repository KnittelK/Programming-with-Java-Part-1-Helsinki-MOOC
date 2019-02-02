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


public class birdDatabase {
    private ArrayList<Bird> birdList;
    
    public birdDatabase() {
        this.birdList = new ArrayList<Bird>();
    }
    
    public void addBird(Bird bird) {
        boolean exists = false;
        // checks if the bird already exists in the database
        for (Bird ele : birdList){
            if (ele.getName().equals(bird.getName())) {
                exists=true;
                break;
            }
        }
        // if the bird is not in the database, add it.
        if (!exists) {
            this.birdList.add(bird);
        }
    }
    
    public void Observation(String name) {
        boolean observationAdded = false;
        for (Bird ele : birdList) {
            if (ele.getName().equals(name)) {
                ele.addObservation();
                observationAdded = true;
            }
        }
        // if bird was not found in database
        if (!observationAdded) {
            System.out.println("Is not a bird!");
        }
    }
    public void Statistics() {
        for (Bird ele : birdList) {
            printInfo(ele);
        }
    }
    
    private void printInfo(Bird bird) {
        System.out.println(bird.getName() + " (" + bird.getLatinName() + 
        "): " + bird.getObservations() + " observations");
    }
    
    public void Show(String name) {
        for (Bird ele : birdList) {
            if (ele.getName().equals(name)) {
                printInfo(ele);
            }
        }
    }
    
    
}

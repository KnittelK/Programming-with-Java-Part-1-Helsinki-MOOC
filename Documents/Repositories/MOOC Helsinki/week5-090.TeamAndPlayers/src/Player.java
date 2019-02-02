/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KevinK
 */
public class Player {
    private String name;
    private int goalsScored;
    
    public Player(String playerName) {
        this.name = playerName;
        this.goalsScored = 0;
    }
    
    public Player(String playerName, int goals) {
        this.name = playerName;
        this.goalsScored = goals;
    }

    public String getName() {
        return this.name;
    }

    public int goals() {
        return this.goalsScored;
    }

    public String toString() {
        return "Player: " + getName() + ", goals " + goals();
    }
    
    
}

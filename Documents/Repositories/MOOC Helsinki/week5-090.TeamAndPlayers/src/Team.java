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

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxPlayers;
    
    public Team(String teamName) {
        this.name = teamName;
        this.players = new ArrayList<Player>();
        this.maxPlayers = 16;
    }

    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
        if (size() < this.maxPlayers) {
            this.players.add(player);
        }
    }
    
    public void printPlayers() {
        for (Player ele : this.players) {
            System.out.println(ele);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxPlayers = maxSize;
    }
    
    public int size() {
        return this.players.size();
    }
    
    public int goals() {
        int total = 0;
        for (Player ele : this.players) {
            total+=ele.goals();
        }
        return total;
    }
}

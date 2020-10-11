/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author user
 */
public class Team implements Comparable<Team>{
    private String teamname;
    private int wins;

    public Team(String teamname, int wins) {
        this.teamname = teamname;
        this.wins = wins;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
    
    
    // -1< ,0=, 1>    
    public int compareTo(Team o) {
        if(this.wins<o.getWins()){
            return -1;
        }else if(this.wins== o.getWins() ){
            return 0;
        }else{
            return 1;
        }
    }
     
    
 
}

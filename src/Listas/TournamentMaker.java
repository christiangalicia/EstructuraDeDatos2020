/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TournamentMaker {
     //determina y presenta la organizacion del torneo
    public void make() throws IOException {
        ArrayOrderList<Team> tournament = new ArrayOrderList<Team>();
        String team1, team2, teamname;
        int numwins, numteams = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Tournament Maker");
        while (((numteams % 2) != 0) || (numteams == 0)) {
            System.out.println("Enter the number ok teams (must be even):");
            numteams = in.nextInt();
            in.nextLine();
        }
        System.out.println("Enter " + numteams + " team names and number of wins:");
        System.out.println("Teams may be entered in any order ");

        for (int count = 1; count <= numteams; count++) {
            System.out.println("Enter team name: ");
            teamname = in.nextLine();
            System.out.println("enter number of wins:");
            numwins = in.nextInt();
            in.nextLine();
            tournament.add(new Team(teamname, numwins));
        }
        System.out.println("The first round mathchups are: ");

        for (int count = 1; count <= (numteams / 2); count++) {
            team1 = (tournament.removeFirst()).getTeamname();
            team2 = (tournament.removeLast()).getTeamname();
            System.out.println("Game "+count + " is " +team1+ " against "+team2);
            System.out.println("with the winner to play the winer of game "
                    + (((numteams / 2) + 1) - count));
        }

    }
}
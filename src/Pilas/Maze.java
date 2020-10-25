/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.util.Arrays;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author adrian
 */
public final class Maze{

    private final int TRIED = 3;
    private final int PATH = 7;
   

        private int[][] grid = {
    {1, 1, 0, 1, 1, 0},
    {1, 0, 0, 0, 0, 0},
    {1, 1, 0, 0, 0, 1},
    {1, 0, 0, 1, 0, 1},
    {1, 1, 1, 1, 1, 1}};



    private StackADT<Position> push_new_pos(int x, int y, StackADT<Position> stack) {
        Position npos = new Position();
        npos.setX(x);
        npos.setY(y);
        if (valid(npos.getX(), npos.getY())) {
            stack.push(npos);
        }
        return stack;
    }

    public boolean traverse() {
        try{
            boolean done = false;
            Position pos = new Position();
            StackADT<Position> stack = new LinkedStack<>();//LinkedStack<Position>() //Aqui solo se remplaza`por arrayset
            stack.push(pos);
            while (!(done)) {           // while (!done)     
                pos = stack.pop();
                grid[pos.getX()][pos.getY()] = TRIED;
                if (pos.getX() == grid.length - 1 && pos.getY() == grid[0].length - 1) {
                    done = true;
                } else {
                    stack = push_new_pos(pos.getX(), pos.getY() - 1, stack);
                    stack = push_new_pos(pos.getX(), pos.getY() + 1, stack);
                    stack = push_new_pos(pos.getX() - 1, pos.getY(), stack);
                    stack = push_new_pos(pos.getX() + 1, pos.getY(), stack);

                }
                //mostrar los pasos que siguio
//                System.out.println(toString());

            }
            return done;
        }catch(Exception e){
            return false;
        }
        

    }

    private boolean valid(int row, int column) {
        boolean result = false;
        //limite de la matriz
        if (row >= 0 && row < grid.length && column >= 0 && column < grid[row].length) {
            if (grid[row][column] == 1) {
                result = true;
            }
        }
        return result;

    }

    public String toString() {
        String result = "\n";
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                result += grid[row][column] + "  ";
            }
            result += "\n";
        }
        return result;
    }
    
   
    
    
    
}

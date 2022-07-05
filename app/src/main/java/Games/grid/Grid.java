package Games.grid;

import Games.ship.Ship;

public class Grid {
    private final int GRIDSIZE = 5;
    private char[][] grid = new char[GRIDSIZE][GRIDSIZE];

    public Grid(){
        for (int column = 0; column < GRIDSIZE; column++){
            for (int row = 0; row < GRIDSIZE; row++){
                grid[column][row] = 'o';
            }
        }
    }

    public void printGrid(){
        System.out.println("  ABCDE");
        System.out.println("  -----");
        for(int column = 0; column < GRIDSIZE; column++){
            System.out.print(column+1);
            System.out.print("|");
            for(int row = 0; row < GRIDSIZE; row++){
                System.out.print(grid[column][row]);
            }
            System.out.println("");
        }
    }

    public void placeShip(Ship ship){

    }

}

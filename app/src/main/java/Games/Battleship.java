package Games;

import Games.grid.Grid;
import Games.ship.Ship;

public class Battleship {
    public static void main(String[] args) {
        Grid myGrid = new Grid();
        myGrid.printGrid();
// Emma, this: /* */ is a block comment
        Ship ship = new Ship();
        ship.setCoordinate("A1 B2");
    }
}
/*
all
in
here
will
be
commented :)
*/

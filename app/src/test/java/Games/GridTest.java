package Games;

import org.junit.Test;

import Games.grid.Grid;
import Games.ship.Ship;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class GridTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test public void gridPrintedToScreen(){
        Grid grid = new Grid();
        grid.printGrid();

        Assert.assertEquals("  ABCDE\n  -----\n1|ooooo\n2|ooooo\n3|ooooo\n4|ooooo\n5|ooooo\n", outputStreamCaptor.toString());
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test public void myGridandEnemyGrid(){
        Grid myGrid = new Grid();
        Grid enemyGrid = new Grid();
        myGrid.printGrid();
        enemyGrid.printGrid();
        Assert.assertEquals("  ABCDE\n  -----\n1|ooooo\n2|ooooo\n3|ooooo\n4|ooooo\n5|ooooo\n  ABCDE\n  -----\n1|ooooo\n2|ooooo\n3|ooooo\n4|ooooo\n5|ooooo\n",outputStreamCaptor.toString());
    }

    @Test public void PlaceAShip(){
        Grid grid = new Grid();
        Ship ship = new Ship();
        ship.setCoordinate("A1 B1");
        grid.placeShip(ship);
        grid.printGrid();
        Assert.assertEquals("  ABCDE\n  -----\n1|SSooo\n2|ooooo\n3|ooooo\n4|ooooo\n5|ooooo\n", outputStreamCaptor.toString());
    }

}
/*
 GRID
 SHIP
SHIP column = A1
SHIP row = C1
*/

package Games;

import org.junit.Test;
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
}

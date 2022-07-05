package grid;

import java.util.Arrays;

public class Grid{
    public final int BOARD_SIZE = 5;

    private final char[][] grid = new char[BOARD_SIZE][BOARD_SIZE];

    public Grid(){
        for(int i = 0; i < BOARD_SIZE; i++){
            for(int j = 0; j < BOARD_SIZE; j++){
                this.grid[i][j] = 'o';
            }
        }
    }

    public void printGrid(){
        System.out.println("  ABCDE");
        System.out.println("  -----");
        for(int i = 0; i < BOARD_SIZE; i++){
            System.out.print(i+1);
            System.out.print("|");
            for(int j = 0; j < BOARD_SIZE; j++){
                System.out.print(this.grid[i][j]);
            }
            System.out.println("");
        }

    }

}

/*


class OutputGrid:

# ▢ - water ▣ - hit water
# ☆ - ship  ★ - hit ship

  enemygrid = {
    "A1": "▢", "A2": "▢", "A3": "▢", "A4": "▢", "A5": "▢",
    "B1": "▢", "B2": "▢", "B3": "▢", "B4": "▢", "B5": "▢",
    "C1": "▢", "C2": "▢", "C3": "▢", "C4": "▢", "C5": "▢",
    "D1": "▢", "D2": "▢", "D3": "▢", "D4": "▢", "D5": "▢",
    "E1": "▢", "E2": "▢", "E3": "▢", "E4": "▢", "E5": "▢"
  }

  columnmap = {
    "0": "A",
    "1": "B",
    "2": "C",
    "3": "D",
    "4": "E"
  }
  column = 0
  row = 0
  while column < 5:
    row = 0
    while row < 5:
      dictkey = columnmap[str(column)] + str(row+1)
      print(grid[dictkey], end=" ")
      row += 1
    print("")
    column += 1

*/

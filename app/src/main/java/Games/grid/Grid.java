package Games;

public class Grid {
    private final int GRIDSIZE = 5;
    private char[][] grid = new char[GRIDSIZE][GRIDSIZE];

    public Grid(){
        for (int i = 0; i < GRIDSIZE ; i++){
            for (int j = 0; j < GRIDSIZE; j++){
                grid[i][j] = 'o';
            }
        }
    }

    public void printGrid(){
        System.out.println("  ABCDE");
        System.out.println("  -----");
        for(int i = 0; i < GRIDSIZE ; i++){
            System.out.print(i+1);
            System.out.print("|");
            for(int j = 0; j < GRIDSIZE ; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println("");
        }
    }
}

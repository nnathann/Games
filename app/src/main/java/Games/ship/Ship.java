package Games.ship;

public class Ship {
    private boolean isSunk;
    private int size = 2;
    private int startCol;
    private int endCol;
    private int startRow;
    private int endRow;

    public void setCoordinate(String shipPlacement){
        String[] str = shipPlacement.split("\\s+");
        String firstCoordinate = str[0];
        String secondCoordinate = str[1];
        String[] str2 = firstCoordinate.split("");
        String firstColumn = str2[0];
        String firstRow = str2[1];
        String[] str3 = secondCoordinate.split("");
        String secondColumn = str3[0];
        String secondRow = str3[1];
        this.startRow = Integer.parseInt(firstRow);
        this.endRow = Integer.parseInt(secondRow);
        this.startCol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(firstColumn);
        this.endCol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(secondColumn);
    }
}
/*





 */

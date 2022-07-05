package Games.grid;

public class Square {
    private final int column;
    private final int row;


    public Square(int column, int row) {
        this.column = column;
        this.row = row;
    }

    private enum SquareStatus {
        EMPTY("🌊"),
        SHIP("⛵️"),
        HIT("🔥"),
        MISS("💩"),
        SUNK("💀");

        String squareCharatcter;

        SquareStatus(String squareCharatcter) {
            this.squareCharatcter = squareCharatcter;
        }
        public String GetSquaresStatus(){
            return this.squareCharatcter;
        }

        public String getCharacter() {
            return this.squareCharatcter;
        }
    }
}
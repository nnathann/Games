package grid;

public class Square {
    private final int x;
    private final int y;


    public Square(int i, int j) {
        this.x = i;
        this.y = j;
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
            return squareCharatcter;
        }
    }
}

public class Coordinate {

    final int x;
    final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate xMove(int value) {
        return new Coordinate(x+value, y);
    }

    public Coordinate yMove(int value) {
        return new Coordinate(x, y+value);
    }
}

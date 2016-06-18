public class Coordinate {

    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate xMove(int value) {
        return new Coordinate(x + value, y);
    }

    Coordinate yMove(int value) {
        return new Coordinate(x, y + value);
    }

    boolean isValid(Coordinate maxCoordinate) {
        if (x < 0) {
            return false;
        }
        if (y < 0) {
            return false;
        }
        if (x > maxCoordinate.x) {
            return false;
        }
        if (y > maxCoordinate.y) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinate that = (Coordinate) o;

        if (x != that.x) return false;
        return y == that.y;

    }
}

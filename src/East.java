public class East implements CardinalDirection {

    @Override
    public CardinalDirection turn(RelativeDirection relativeDirection) {
        if(relativeDirection == RelativeDirection.RIGHT) {
            return CardinalDirection.SOUTH;
        }
        if(relativeDirection == RelativeDirection.LEFT) {
            return CardinalDirection.NORTH;
        }
        return this;
    }

    @Override
    public Coordinate move(Coordinate coordinate) {
        return coordinate.xMove(1);
    }

    @Override
    public String toString() {
        return " E";
    }
}

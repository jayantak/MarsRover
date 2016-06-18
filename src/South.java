public class South implements CardinalDirection {

    @Override
    public CardinalDirection turn(RelativeDirection relativeDirection) {
        if(relativeDirection == RelativeDirection.RIGHT) {
            return CardinalDirection.WEST;
        }
        if(relativeDirection == RelativeDirection.LEFT) {
            return CardinalDirection.EAST;
        }
        return this;
    }

    @Override
    public Coordinate move(Coordinate coordinate) {
        return coordinate.yMove(-1);
    }

    @Override
    public String toString() {
        return " S";
    }
}

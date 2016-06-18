public class South implements CardinalDirection {

    @Override
    public CardinalDirection turn(RelativeDirection relativeDirection) {
        if(relativeDirection == RelativeDirection.RIGHT) {
            return new West();
        }
        if(relativeDirection == RelativeDirection.LEFT) {
            return new East();
        }
        return this;
    }

    @Override
    public Coordinate move(Coordinate coordinate) {
        return coordinate.yMove(-1);
    }
}

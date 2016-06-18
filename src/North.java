public class North implements CardinalDirection {

    @Override
    public CardinalDirection turn(RelativeDirection relativeDirection) {
        if(relativeDirection == RelativeDirection.RIGHT) {
            return new East();
        }
        if(relativeDirection == RelativeDirection.LEFT) {
            return new West();
        }
        return this;
    }

    @Override
    public Coordinate move(Coordinate coordinate) {
        return coordinate.yMove(1);
    }
}

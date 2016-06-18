public class East implements CardinalDirection {

    @Override
    public CardinalDirection turn(RelativeDirection relativeDirection) {
        if(relativeDirection == RelativeDirection.RIGHT) {
            return new South();
        }
        if(relativeDirection == RelativeDirection.LEFT) {
            return new North();
        }
        return this;
    }

    @Override
    public Coordinate move(Coordinate coordinate) {
        return coordinate.xMove(1);
    }
}

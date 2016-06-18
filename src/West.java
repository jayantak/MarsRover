public class West implements CardinalDirection {

    @Override
    public CardinalDirection turn(RelativeDirection relativeDirection) {
        if(relativeDirection == RelativeDirection.RIGHT) {
            return new North();
        }
        if(relativeDirection == RelativeDirection.LEFT) {
            return new South();
        }
        return this;
    }

    @Override
    public Coordinate move(Coordinate coordinate) {
        return coordinate.xMove(-1);
    }
}

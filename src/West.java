//Understands a cardinal direction
public class West implements CardinalDirection {

    @Override
    public CardinalDirection turn(RelativeDirection relativeDirection) {
        if(relativeDirection == RelativeDirection.RIGHT) {
            return CardinalDirection.NORTH;
        }
        if(relativeDirection == RelativeDirection.LEFT) {
            return CardinalDirection.SOUTH;
        }
        return this;
    }

    @Override
    public Coordinate move(Coordinate coordinate) {
        return coordinate.xMove(-1);
    }

    @Override
    public String toString() {
        return " W";
    }
}

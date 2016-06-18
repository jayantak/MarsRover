//Understands a cardinal direction
public class North implements CardinalDirection {

    @Override
    public CardinalDirection turn(RelativeDirection relativeDirection) {
        if(relativeDirection == RelativeDirection.RIGHT) {
            return CardinalDirection.EAST;
        }
        if(relativeDirection == RelativeDirection.LEFT) {
            return CardinalDirection.WEST;
        }
        return this;
    }

    @Override
    public Coordinate move(Coordinate coordinate) {
        return coordinate.yMove(1);
    }

    @Override
    public String toString() {
        return " N";
    }
}

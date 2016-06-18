public interface CardinalDirection {

    CardinalDirection turn(RelativeDirection relativeDirection);

    Coordinate move(Coordinate coordinate);
}

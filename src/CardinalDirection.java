public interface CardinalDirection {

    East EAST = new East();
    West WEST = new West();
    South SOUTH = new South();
    North NORTH = new North();

    CardinalDirection turn(RelativeDirection relativeDirection);

    Coordinate move(Coordinate coordinate);
}

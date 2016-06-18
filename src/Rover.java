//Understands movement on an X-Y plane
class Rover {

    private Coordinate coordinate;
    private CardinalDirection facing;
    private Coordinate maxCoordinate;

    public Rover(Coordinate coordinate, CardinalDirection facing, Coordinate maxCoordinate) {
        this.coordinate = coordinate;
        this.facing = facing;
        this.maxCoordinate = maxCoordinate;
    }

    void turn(RelativeDirection relativeDirection) {
        facing = facing.turn(relativeDirection);
    }

    void move() {
        Coordinate newCoordinate = facing.move(coordinate);
        if (newCoordinate.isValid(maxCoordinate)) {
            coordinate = newCoordinate;
        }
    }


    @Override
    public String toString() {
        return "Rover{" +
                "coordinate=" + coordinate +
                ", facing=" + facing +
                '}';
    }
}

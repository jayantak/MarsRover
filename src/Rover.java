class Rover {

    private Coordinate coordinate;
    private CardinalDirection facing;

    public Rover(Coordinate coordinate, CardinalDirection facing) {
        this.coordinate = coordinate;
        this.facing = facing;
    }

    void turn(RelativeDirection relativeDirection) {
        facing = facing.turn(relativeDirection);
    }

    void move() {
        coordinate = facing.move(coordinate);
    }
}

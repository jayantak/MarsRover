import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        MarsRover marsRover = new MarsRover(bufferedReader);
        Coordinate maxCoordinate = marsRover.getMax();
        Rover rover = new Rover(new Coordinate(1, 2), CardinalDirection.NORTH, maxCoordinate);
        rover.turn(RelativeDirection.LEFT);
        rover.move();
        rover.turn(RelativeDirection.LEFT);
        rover.move();
        rover.turn(RelativeDirection.LEFT);
        rover.move();
        rover.turn(RelativeDirection.LEFT);
        rover.move();
        rover.move();
        System.out.println(rover.toString());
    }
}

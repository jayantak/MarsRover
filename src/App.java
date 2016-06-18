import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        MarsRover marsRover = new MarsRover(bufferedReader);
        Coordinate maxCoordinate = marsRover.getMax();

        Rover rover = marsRover.getRover(maxCoordinate);
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

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        MarsRover marsRover = new MarsRover(bufferedReader);
        Coordinate maxCoordinate = marsRover.getMax();
        boolean anotherRover = true;
        while(anotherRover) {
            Rover rover = marsRover.getRover(maxCoordinate);
            System.out.println(marsRover.roverCommands(rover));
            anotherRover = marsRover.anotherRover();
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Parser parser = new Parser(bufferedReader);
        Coordinate maxCoordinate = parser.getMax();
        boolean anotherRover = true;
        while(anotherRover) {
            Rover rover = parser.getRover(maxCoordinate);
            System.out.println(parser.roverCommands(rover));
            anotherRover = parser.anotherRover();
        }
    }
}

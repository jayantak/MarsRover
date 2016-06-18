import java.io.BufferedReader;
import java.io.IOException;

public class MarsRover {

    BufferedReader bufferedReader;

    public MarsRover(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public Coordinate getMax() {
        String maxCoordinate = "";

        try {
            maxCoordinate = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Something went wrong with input");
        }

        String[] split = maxCoordinate.split(" ");
        return new Coordinate(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }
}

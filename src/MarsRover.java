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

    public Rover getRover(Coordinate maxCoordinate) {
        String roverDetails = "";

        try {
            roverDetails = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Something went wrong with input");
        }

        String[] split = roverDetails.split(" ");
        return new Rover(new Coordinate(Integer.parseInt(split[0]), Integer.parseInt(split[1])), getDirection(split[2]), maxCoordinate);
    }

    public String roverCommands(Rover rover) {
        String roverCommands = "";

        try {
            roverCommands = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Something went wrong with input");
        }

        for (int i = 0; i < roverCommands.length(); i++) {
            if(roverCommands.charAt(i) == 'L') {
                rover.turn(RelativeDirection.LEFT);
            }
            if(roverCommands.charAt(i) == 'R') {
                rover.turn(RelativeDirection.RIGHT);
            }
            if(roverCommands.charAt(i) == 'M') {
                rover.move();
            }
        }
        return rover.toString();
    }

    private CardinalDirection getDirection(String dir) {
        if("N".equals(dir)) {
            return CardinalDirection.NORTH;
        }
        if("S".equals(dir)) {
            return CardinalDirection.SOUTH;
        }
        if("W".equals(dir)) {
            return CardinalDirection.WEST;
        }
        if("E".equals(dir)) {
            return CardinalDirection.EAST;
        }
        return null;
    }
}

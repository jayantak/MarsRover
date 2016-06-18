import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class RoverTest {

    private Coordinate coordinate;
    private Coordinate maxCoordinate;
    private CardinalDirection facing;

    @Before
    public void setUp() throws Exception {
        coordinate = mock(Coordinate.class);
        maxCoordinate = mock(Coordinate.class);
        facing = mock(CardinalDirection.class);
    }

    @Test
    public void shouldGetTurnFromLeft() {

        Rover rover = new Rover(coordinate, facing, maxCoordinate);
        rover.turn(RelativeDirection.LEFT);

        verify(facing).turn(RelativeDirection.LEFT);
    }

    @Test
    public void shouldGetTurnFromRight() {

        Rover rover = new Rover(coordinate, facing, maxCoordinate);
        rover.turn(RelativeDirection.RIGHT);

        verify(facing).turn(RelativeDirection.RIGHT);
    }

    @Test
    public void shouldMoveEastWhenEast() {

        Rover rover = new Rover(coordinate, facing, maxCoordinate);
        Coordinate newCoordinate = mock(Coordinate.class);
        when(facing.move(coordinate)).thenReturn(newCoordinate);
        when(newCoordinate.isValid(maxCoordinate)).thenReturn(true);
        rover.move();

        verify(facing).move(coordinate);
    }
}

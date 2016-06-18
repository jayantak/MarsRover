import org.junit.Before;
import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RoverTest {

    private Coordinate coordinate;
    private CardinalDirection facing;

    @Before
    public void setUp() throws Exception {
        coordinate = mock(Coordinate.class);
        facing = mock(CardinalDirection.class);
    }

    @Test
    public void shouldGetTurnFromLeft() {

        Rover rover = new Rover(coordinate, facing);
        rover.turn(RelativeDirection.LEFT);

        verify(facing).turn(RelativeDirection.LEFT);
    }

    @Test
    public void shouldGetTurnFromRight() {

        Rover rover = new Rover(coordinate, facing);
        rover.turn(RelativeDirection.RIGHT);

        verify(facing).turn(RelativeDirection.RIGHT);
    }

    @Test
    public void shouldMoveEastWhenEast() {

        Rover rover = new Rover(coordinate, facing);
        rover.move();

        verify(facing).move(coordinate);
    }
}

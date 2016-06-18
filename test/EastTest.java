import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class EastTest {


    @Test
    public void shouldReturnSouthWhenTurningRight() {
        East east = new East();
        assertEquals(CardinalDirection.SOUTH, east.turn(RelativeDirection.RIGHT));
    }

    @Test
    public void shouldReturnNorthWhenTurningLeft() {
        East east = new East();

        assertEquals(CardinalDirection.NORTH, east.turn(RelativeDirection.LEFT));
    }

    @Test
    public void shouldMoveInThePositiveXDirection() {
        Coordinate coordinate = mock(Coordinate.class);
        East east = new East();

        east.move(coordinate);
        verify(coordinate).xMove(1);
    }
}

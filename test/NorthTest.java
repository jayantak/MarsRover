import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class NorthTest {

    @Test
    public void shouldReturnEastWhenTurningRight() {
        North north = new North();
        assertEquals(CardinalDirection.EAST, north.turn(RelativeDirection.RIGHT));
    }

    @Test
    public void shouldReturnWestWhenTurningLeft() {
        North north = new North();
        assertEquals(CardinalDirection.WEST, north.turn(RelativeDirection.LEFT));
    }

    @Test
    public void shouldMoveInThePositiveYDirection() {
        Coordinate coordinate = mock(Coordinate.class);
        North north = new North();
        north.move(coordinate);
        verify(coordinate).yMove(1);
    }
}

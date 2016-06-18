import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SouthTest {

    @Test
    public void shouldReturnWestWhenTurningRight() {
        South south = new South();
        assertEquals(CardinalDirection.WEST, south.turn(RelativeDirection.RIGHT));
    }

    @Test
    public void shouldReturnEastWhenTurningLeft() {
        South south = new South();
        assertEquals(CardinalDirection.EAST, south.turn(RelativeDirection.LEFT));
    }

    @Test
    public void shouldMoveInTheNegativeYDirection() {
        Coordinate coordinate = mock(Coordinate.class);
        South south = new South();
        south.move(coordinate);
        verify(coordinate).yMove(-1);
    }
}

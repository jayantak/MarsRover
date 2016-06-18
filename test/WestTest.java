import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WestTest {


    @Test
    public void shouldReturnNorthWhenTurningRight() {
        West west = new West();
        assertEquals(CardinalDirection.NORTH, west.turn(RelativeDirection.RIGHT));
    }

    @Test
    public void shouldReturnEastWhenTurningLeft() {
        West west = new West();
        assertEquals(CardinalDirection.SOUTH, west.turn(RelativeDirection.LEFT));
    }

    @Test
    public void shouldMoveInTheNegativeXDirection() {
        Coordinate coordinate = mock(Coordinate.class);
        West west = new West();

        west.move(coordinate);
        verify(coordinate).xMove(-1);
    }
}

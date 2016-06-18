import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class CoordinateTest {

    private Coordinate maxCoordinate;

    @Before
    public void setUp() throws Exception {
        maxCoordinate = new Coordinate(5, 5);
    }

    @Test
    public void xMove1ShouldChangeValueOfXBy1() {
        assertEquals(new Coordinate(5,3), new Coordinate(4,3).xMove(1));
    }

    @Test
    public void xMove2ShouldChangeValueOfXby2() {
        assertEquals(new Coordinate(6,3), new Coordinate(4,3).xMove(2));
    }

    @Test
    public void yMove1ShouldChangeValueOfXBy1() {
        assertEquals(new Coordinate(4,4), new Coordinate(4,3).yMove(1));
    }

    @Test
    public void yMove2ShouldChangeValueOfXby2() {
        assertEquals(new Coordinate(4,5), new Coordinate(4,3).yMove(2));
    }

    @Test
    public void negativeXValueIsInvalid() {
        Coordinate coordinate = new Coordinate(-1, 1);
        assertFalse(coordinate.isValid(maxCoordinate));
    }

    @Test
    public void negativeYValueIsInvalid() {
        Coordinate coordinate = new Coordinate(1, -1);
        assertFalse(coordinate.isValid(maxCoordinate));
    }

    @Test
    public void exceededXValueIsInvalid() {
        Coordinate coordinate = new Coordinate(6, 1);
        assertFalse(coordinate.isValid(maxCoordinate));
    }

    @Test
    public void exceededYValueIsInvalid() {
        Coordinate coordinate = new Coordinate(3, 7);
        assertFalse(coordinate.isValid(maxCoordinate));
    }

    @Test
    public void valueWithinMaxIsValid() {
        Coordinate coordinate = new Coordinate(1, 1);
        assertTrue(coordinate.isValid(maxCoordinate));
    }
}

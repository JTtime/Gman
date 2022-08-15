import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GmanTest {

    @Test
    void fromHigherXCoordinatelowerYCoordinate() {
        var upsideLeft = new com.example.geektrust.Gman();
        assertEquals(2, upsideLeft.powTurns(3, 4, 1, 6, "E"));
    }

    @Test
    void fromEqualXCoordinateLowerYCoordinate() {
        var upsideStraight = new com.example.geektrust.Gman();
        assertEquals(2, upsideStraight.powTurns(2, 2, 2, 5, "S"));
    }

    @Test
    void fromEqualXCoordinateHigherYCoordinate() {
        var downsideStraight = new com.example.geektrust.Gman();
        assertEquals(0, downsideStraight.powTurns(3, 6, 3, 2, "S"));
    }

    @Test
    void fromLowerXCoordinateEqualYCoordinate() {
        var towardsRight = new com.example.geektrust.Gman();
        assertEquals(0, towardsRight.powTurns(1, 4, 4, 4, "E"));
    }

    @Test
    void fromHigherXCoordinateEqualYCoordinate() {
        var towardsLeft = new com.example.geektrust.Gman();
        assertEquals(0, towardsLeft.powTurns(5, 3, 1, 3, "W"));
    }

    @Test
    void CheckingGridStepsCalculation() {
        var test6 = new com.example.geektrust.Gman();
        assertEquals(2, test6.powGrid(5, 3));
    }

}

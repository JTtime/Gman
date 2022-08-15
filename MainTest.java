import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void checkPower() {
        com.example.geektrust.Trial power = new com.example.geektrust.Trial();
        assertEquals(150, power.calculatePower(3, 4, 1, 6, "E"));

    }



}

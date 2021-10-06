//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitSampleTest {
    @Test
    void testFour() {
        System.out.println("this is simply testing something");
        assertEquals(4, 5 - 1);
    }

    @Test
    void testValidity() {
        System.out.println("should return true");
//        boolean answer = 1 < 4;
        boolean answer = 4 > 4;
        assertTrue(answer);
    }

    @Test
//    @Disabled("Some odd test")
    void someOddTest() {
        System.out.println("some very very odd test here");
    }



}
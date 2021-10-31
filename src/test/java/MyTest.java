import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void simpleTest() {
        assertEquals(2,School.getAverage(new int[] {2,2,2,2}));
        assertEquals(3,School.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,School.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }


    private static class School {
        public static int getAverage(int[] marks) {
            int sum = 0;
            for (int j : marks) {
                sum += j;
            }
            return sum / marks.length;
        }
    }
}
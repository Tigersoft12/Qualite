import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSub {
    @Test
    public void testSubPositiveNumbers() {
        Sub sub = new Sub();
        int result = sub.sub(10, 5);
        assertEquals(5, result, "10 - 5 should be 5");
    }

    @Test
    public void testSubNegativeNumbers() {
        Sub sub = new Sub();
        int result = sub.sub(-3, -7);
        assertEquals(4, result, "-3 - (-7) should be 4");
    }
}

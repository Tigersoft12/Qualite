import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestAdd {

    @Test
    void testAddPositiveNumbers() {
        Add add = new Add();
        assertEquals(5, add.add(2, 3), "2 + 3 devrait être 5");
    }

    @Test
    void testAddWithNegativeNumbers() {
        Add add = new Add();
        assertEquals(0, add.add(-2, 2), "-2 + 2 devrait être 0");
    }

    @Test
    void testAddWithBothNegative() {
        Add add = new Add();
        assertEquals(-7, add.add(-5, -2), "-5 + (-2) devrait être -7");
    }
}
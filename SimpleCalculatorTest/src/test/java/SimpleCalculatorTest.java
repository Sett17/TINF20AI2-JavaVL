import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {
    private final int number1 = 17;
    private final int number2 = 0;

    @Test
    void testSum() {
        Assertions.assertEquals(number1, SimpleCalculator.sum(number1, number2));
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(number1, SimpleCalculator.subtract(number1, number2));
    }
}

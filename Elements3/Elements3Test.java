import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Elements3Test {

    @Test
    public void testForEvenNumbers() {

        Elements3 elements3 = new Elements3();

        int[] number = {1, 2, 3, 4, 5};

        int[] result = elements3.evenNumbers(number);

        
        int[] expected = {2, 4};

        assertArrayEquals(expected, result);
    }
}

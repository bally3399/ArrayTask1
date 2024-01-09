import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Elements4Test {

    @Test
    public void testFilterOddNumbers() {
        Elements4 elements4 = new Elements4();

        int[] array = {1, 2, 3, 4, 5, 6};

        int[] result = elements4.filterOddNumbers(array);

        int[] expected = {1, 3, 5};

        assertArrayEquals(expected, result);
    }
}


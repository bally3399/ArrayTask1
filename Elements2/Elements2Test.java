import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Elements2Test {

    @Test
    public void testFindNumberInArray() {
        Elements2 elements2 = new Elements2();

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int numberToFind = 7;

        boolean result = elements2.findNumber(array, numberToFind);

        assertTrue(result, "Number should be found in the array");
    }

}
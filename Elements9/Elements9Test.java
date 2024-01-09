import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Elements9Test{
	@Test
    	public void testThatCombineArray() {
		Elements9 elements9 = new Elements9();

		Object[] array1 = {"a", "b", "c"};

		Object[] array2 = {1, 2, 3};

		Object[] expected = {"a", 1, "b", 2, "c", 3};

		Object[] result = elements9.combineArrays(array1, array2);

		assertArrayEquals(expected, result);

	}


}
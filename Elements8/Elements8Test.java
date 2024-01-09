import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Elements8Test{
	@Test
    	public void testThatSumAllNumbersInArray() {

		Elements8 elements8 = new Elements8();

		int[] array = {1, 2, 3, 4, 5, 6, 7};

		int expected = 28;

		int result = elements8.sumAllNumbersInArray(array);

		assertEquals(expected, result);

	}

}


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Elements10Test{
	@Test
    	public void testExtractDigits(){
		Elements10 elements10 = new Elements10();

		int number = 2342;

		int[] expected = {2, 3, 4, 2};

		int[] result = elements10.extractDigits(number);

		assertArrayEquals(expected, result);



	}

}


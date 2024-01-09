import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Elements5Test{
	
	@Test
	public void testThatReturnHighestNumberInArrayMethodWorks(){
		//Given
		Elements5 elements5 = new Elements5();
		int[] array = {1, 2, 3, 4, 5};
		//When
		int number = elements5.returnHighestNumberInArray(array);

		//Assert
		assertEquals(5, number);

	}


}
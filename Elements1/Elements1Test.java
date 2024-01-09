import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Elements1Test{
	
	@Test
	public void testThatReverseNumbersInArrayMethodWork(){
		//Given
		Elements1 elements1 = new Elements1();
		int[] array = {1, 2, 3, 4, 5};

		//When
		int[] result = elements1.reverseNumbersInArray(array);
		
		//Assert
		assertEquals(array, result);

	}


}
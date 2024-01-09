import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Elements7Test{
	@Test
    	public void testThatFindsTotalOfAList() {

	Elements7 elements7 = new Elements7();

	int[] array = {1, 2, 3, 4, 5};
        int expectedTotal = 15; 

        
        int result = elements7.totalOfAList(array);

        // Assert
        assertEquals(expectedTotal, result);
    }
	




}

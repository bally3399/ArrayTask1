public class Elements7{


public static int totalOfAList(int[] array){
		int runningTotal = 0;
		int length = array.length;
		for(int index = 0; index < length; index++){
			runningTotal += array[index];
		}
		return runningTotal;

	}

}
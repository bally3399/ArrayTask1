public class Elements8{

	public static int sumAllNumbersInArray(int[] array){
		int sum = 0;
		int length = array.length;
		for(int index = 0; index < length; index++){
			sum += array[index];
		}
		return sum;

	}



}
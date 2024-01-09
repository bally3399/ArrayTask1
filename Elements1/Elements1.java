public class Elements1{

	public static int[] reverseNumbersInArray(int[] array){
		int length = array.length;
		int temp = 0;
		for(int index = 0; index < length/2; index++){
			temp = array[index];
			array [index] = array[ length - (index + 1) ];
			array[ length - (index + 1) ] = temp;	
		}
		return array;
	}


}
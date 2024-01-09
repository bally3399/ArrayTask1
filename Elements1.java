import java.util.Arrays;

public class Elements1{

	public static void main(String[] args){
		int [] array = {1,2,3,4,5};
		int[] result = reverseArray(array);
		System.out.println(Arrays.toString(result));
	}


	public static int[] reverseArray(int[] array){
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
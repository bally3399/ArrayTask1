import java.util.Arrays;

public class Elements5{

	public static void main(String[] args){
		int[] array = {1,2,3,4,5};
		int result = highestNumber(array);
		System.out.println(result);

	}
	public static int highestNumber(int[] array){
	int length = array.length;
	int highestNumber = 0;
	for(int index = 0; index < length; index++){
		highestNumber = array[index];
	}	
	return highestNumber;
	}


}
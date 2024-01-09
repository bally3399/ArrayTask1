import java.util.Arrays;

public class Elements3{

	public static void main(String[] args){
		int [] array = {1,2,3,4,5};
		int [] result = evenNumbers(array);
		System.out.println(Arrays.toString(result));
	}

	public static int[] evenNumbers(int[] array){
		int length = array.length;
		double dividedLength = (double) length / 2;
		double newArrayLength = Math.ceil(dividedLength);
		System.out.println(dividedLength);
		int[] newArray;
		if(length % 2 == 0){
			newArray = new int[(int) newArrayLength];
		}
		else{
			newArray = new int[length/2];
		}
		int counter = 0;
		for(int index = 0; index < length; index++){
			if(index % 2 == 1){
				newArray[counter] = array[index];
				counter++;
			}
		}
		return newArray;
	}
}
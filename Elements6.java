import java.util.Arrays;

public class Elements6{

	public static void main(String[] args){
		int[] array1 = {a,b,c};
		int[] array2 = {1,2,3};
		int result = concatenateArray(array1, array2);
		System.out.println(result);
	}
	public static int concatenateArrays(int[] array1, int[] array2){
		int length = array.length;
		int newArray = new int[array1.length + array2.length];
		for(int index = 0; index < length; index++){
			newArray[index] = array1[index];
		}
		for(int index = 0; index < length; index++){
			newArray[index] = array2[index];
		}
		return newArray;
	}	


} 
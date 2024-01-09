import java.util.Arrays;

public class Elements9{

	public static void main(String[] args){

		Object[] array1 = {"a", "b", "c"};

		Object[] array2 = {1, 2, 3};

		Object[] result = combinesArrays(array1, array2);
		
		for (int index = 0; index < result.length; index++){
			System.out.print(result[index] + " ");
		}


	}

	public static Object[] combinedArrays(Object[] array1, Object[] array2){
		int length1 = array1.length;
		int length2 = array2.length;
		int maxLength = Math.max(length1, length2);


		Object[] combinedArray = new Object[length1 + length2];
		
		int combinedIndex = 0;
		for(int index = 0; index < maxLength; index++){
			if(index < length1){
				combinesArray[combinedIndex] = array1[index];
				combinedIndex++;
			}

			if(index < length2){
				combinedArry[combinedIndex] = array2[index];
				combinedIndex++;
			}
		}

		return combinedArray;
		



	}


}
public class Elements9{

	public static Object[] combineArrays(Object[] array1, Object[] array2){
		int length1 = array1.length;
		int length2 = array2.length;
		int maxLength = Math.max(length1, length2);


		Object[] combineArray = new Object[length1 + length2];
		
		int combinedIndex = 0;
		for(int index = 0; index < maxLength; index++){
			if(index < length1){
				combineArray[combinedIndex] = array1[index];
				combinedIndex++;
			}

			if(index < length2){
				combineArray[combinedIndex] = array2[index];
				combinedIndex++;
			}
		}

		return combineArray;
		



	}





}
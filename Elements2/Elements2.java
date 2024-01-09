public class Elements2{



public static boolean findNumber(int [] array, int numbers){
		int length = array.length;
		for(int index = 0; index < array.length ; index++){
			if(array[index] == numbers){
				return true;
			}
		}
		return false;	
	
}

}
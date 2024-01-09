import java.util.Arrays;

public class Elements2{

	public static void main(String[] args){
		int [] array = {1,2,3,4,5,6,7};
		int numbers = 7;
		boolean result = findNumber(array, numbers);
		System.out.println(result);
	}


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
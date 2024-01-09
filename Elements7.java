import java.util.Arrays;

public class Elements7{

	public static void main(String[] args){
		int[] array = {1,2,3,4,5};
		int result = totalOfAList(array);
		System.out.println(result);
	}
	public static int totalOfAList(int[] array){
		int runningTotal = 0;
		int length = array.length;
		for(int index = 0; index < length; index++){
			runningTotal += array[index];
		}
		return runningTotal;

	}

}






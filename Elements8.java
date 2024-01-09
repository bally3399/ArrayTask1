import java.util.Arrays;

public class Elements8{

	public static void main(String[] args){
		int[] array = {1,2,3,4,5};
		int result1 = addAllNumbers1(array);
		System.out.println(result1);

		int result2 = addAllNumbers2(array);
		System.out.println(result2);

		int result3 = addAllNumbers3(array);
		System.out.println(result3);


	}
	public static int addAllNumbers1(int[] array){
		int sum = 0;
		int length = array.length;
		for(int index = 0; index < length; index++){
			sum += array[index];
		}
		return sum;

	}
	public static int addAllNumbers2(int[] array){
		int length = array.length;
		int index = 0;
		int sum = 0;

		do{
			sum += array[index];
			index++;
		}while (index < length);	
		return sum;
	}
	public static int addAllNumbers3(int[] array){
		int length = array.length;
		int index = 0;
		int sum = 0;
		while ( index < length){
			sum += array[index];
			index++;
		}
		return sum;
	}

}


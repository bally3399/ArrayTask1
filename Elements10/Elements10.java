public class Elements10{

	public static int[] extractDigits(int number){
		if(number < 0){
			System.out.println("Input must be a non-negative number");
		}

		if(number == 0){
			return new int[]{0};
		}

		int tempNumber = number;
		int digitCount = 0;
		while(tempNumber > 0){
			tempNumber /= 10; 
			digitCount++;
		}
		int[]digitsArray = new int[digitCount];
		for(int index = digitCount - 1; index >= 0; index--){
			digitsArray[index] = number % 10;
			number /= 10;
		}
		return digitsArray;



	}


}
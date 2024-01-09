public class Elements4 {

    public static int[] filterOddNumbers(int[] array) {
        int length = array.length;
        int oddCount = (length + 1) / 2; 

        int[] oddNumbers = new int[oddCount];
        int counter = 0;

        for (int index = 0; index < length; index++) {
            if (array[index] % 2 != 0) {
                oddNumbers[counter] = array[index];
                counter++;
            }
        }

        return oddNumbers;
    }
}

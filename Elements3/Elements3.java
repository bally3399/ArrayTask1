public static int[] evenNumbers(int[] array) {
        int length = array.length;
        int[] newArray = new int[(length + 1) / 2];
        int counter = 0;

        for (int index = 1; index < length; index += 2) {
            newArray[counter] = array[index];
            counter++;
        }

        return newArray;
    }
}
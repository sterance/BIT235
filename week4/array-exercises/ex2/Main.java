
public class Main {

    public static void main(String[] args) {
        int[] numbers = {73, 914, 256, 481, 999, 32, 678, 145, 802, 567, 219, 430, 761, 88, 354, 690, 12, 947, 523, 276};
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    // swapping via xor, alternative to using tmp variable
                    numbers[i] = numbers[i] ^ numbers[i + 1];
                    numbers[i + 1] = numbers[i] ^ numbers[i + 1];
                    numbers[i] = numbers[i] ^ numbers[i + 1];
                    swapped = true;
                }
            }
        } while (swapped);
        
        System.out.println(java.util.Arrays.toString(numbers));
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] testArray = {73, 914, 256, 481, 999, 32, 678, 145, 802, 567, 219, 430, 761, 88, 354, 690, 12, 947, 523, 276};
        bubbleSort(testArray);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Which number in the test array would you like to search for? ");
        String userInput = scanner.nextLine();
        int targetNum = Integer.parseInt(userInput);

        int searchResult = binarySearch(testArray, targetNum);
        if (searchResult == -1) {
            System.out.printf("The target number %d was not found in the test array%n", targetNum);
        } else {
            System.out.printf("The target number was found at position %d%n", searchResult);
        }
    }

    public static int[] bubbleSort(int[] numbers) {
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
        return numbers;
    }

    public static int binarySearch(int[] numbers, int target) {
        int result = -1;
        int low = 0;
        int high = numbers.length - 1;
        
        while (low <= high) {
            int searchIndex = (low + high) / 2;
            
            if (numbers[searchIndex] == target) {
                result = searchIndex;
                break;
            } else if (target < numbers[searchIndex]) {
                high = searchIndex - 1;
            } else {
                low = searchIndex + 1;
            }
        }
        
        return result;
    }
}

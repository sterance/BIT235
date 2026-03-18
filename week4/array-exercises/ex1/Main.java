public class Main {

    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 5};
        int total = calculateTotal(numbers);
        System.out.printf("Total: %d%n", total);
    }

    public static int calculateTotal(int[] numbers) {
      int total = 0;
      for (int i = 0; i < numbers.length; i++) {
          total += numbers[i];
      }
      return total;
    }
}

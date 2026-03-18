public class Methods {
    public static void main(String[] args) {
        displayWelcome();
        displayNumber(7);
        diceRollGame();
        System.out.printf("Your random number: %d%n", randomNumber(2, 84));
    }
    public static void displayWelcome() {
        System.out.println("Welcome to Java programming");
    }
    public static void displayNumber(int num) {
        System.out.printf("The number is: %d%n", num);
    }
    public static int diceRoll() {
        return (int) (Math.random() * 6) + 1;
    }
    public static void diceRollGame() {
      int roll1 = diceRoll();
      int roll2 = diceRoll();
      int total = roll1 + roll2;
      System.out.printf("Your rolls: %d and %d%n", roll1, roll2);
      if (total == 7) {
        System.out.println("7 is a winner!!");
      } else {
        System.out.println("Try again.");
      } 
    }
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}

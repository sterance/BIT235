import java.util.Scanner;

class ex5 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a number: ");

    String userInput = myObj.nextLine();
    int userInt = Integer.parseInt(userInput);
    if (userInt < 0) {
      System.out.println("Negative");
    } else if (userInt > 0) {
      System.out.println("Positive");
    } else {
      System.out.println("Zero");
    }
  }
}

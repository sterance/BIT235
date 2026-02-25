import java.util.Scanner;

class ex06 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a number: ");

    String userInput = myObj.nextLine();
    int userInt = Integer.parseInt(userInput);
    if (userInt % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}

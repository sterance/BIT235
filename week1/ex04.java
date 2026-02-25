import java.util.Scanner;
class ex04 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter your age: ");

    String userInput = myObj.nextLine();
    int userAge = Integer.parseInt(userInput);
    if (userAge < 18) {
      System.out.println("You are under 18");
    } else {
      System.out.println("You are an adult");
    }
  }
}
